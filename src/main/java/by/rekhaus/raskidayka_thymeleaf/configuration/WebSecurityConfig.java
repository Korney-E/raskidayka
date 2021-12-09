package by.rekhaus.raskidayka_thymeleaf.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity


public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
            .csrf().disable()
            .authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/resources/**").permitAll() .anyRequest().permitAll()
//                .antMatchers("/*.css","/*.jpg").permitAll().anyRequest().permitAll()
//                .antMatchers("/css/**", "/js/**","/img/**", "/webjars/**", "**/favicon.ico", "/index").permitAll().anyRequest().permitAll()


                .antMatchers("/").permitAll()
                .antMatchers("/index", "/img/**", "/css/**").permitAll()
            .antMatchers("/admin").hasAnyRole("ADMIN")
            .anyRequest().authenticated()
            .and()
                .formLogin().permitAll()
//                .loginPage("/login").permitAll()
            .and()
                .httpBasic();


    }

//
//    @Bean
//    public PasswordEncoder passwordEncoder () {
//        return new BCryptPasswordEncoder(12);
//    }

    @Bean
    protected UserDetailsService userDetailsService() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return new InMemoryUserDetailsManager(
            User.builder()
                .username("user")
                .password(encoder.encode("1"))
                .roles("USER")
                .build(),
            User.builder()
                .username("admin")
                .password(encoder.encode("admin"))
                .roles("ADMIN")
                .build()
        );
    }

}