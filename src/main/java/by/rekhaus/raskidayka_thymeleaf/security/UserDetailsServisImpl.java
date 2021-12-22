package by.rekhaus.raskidayka_thymeleaf.security;

import by.rekhaus.raskidayka_thymeleaf.model.User;
import by.rekhaus.raskidayka_thymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service ("userDetailsServisImpl")
public class UserDetailsServisImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserDetailsServisImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Пользователь не найден"));
        return SecurityUser.fromUser(user);
    }
}
