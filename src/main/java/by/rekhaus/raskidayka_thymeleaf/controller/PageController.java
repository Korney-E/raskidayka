package by.rekhaus.raskidayka_thymeleaf.controller;

import by.rekhaus.raskidayka_thymeleaf.entity.User;
import by.rekhaus.raskidayka_thymeleaf.entity.UserEntity;
import by.rekhaus.raskidayka_thymeleaf.repositoriy.UserRepository;
import by.rekhaus.raskidayka_thymeleaf.repositoriy.UserRoleRepository;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @Autowired
    UserRoleRepository userRepository;


    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Раскидайка");
        return "index";
    }

    @RequestMapping("/registration")
    public String register(Model model) {
        model.addAttribute("title", "Регистрация");
        return "registration";
    }


    /*
Для получения данных из формы методом POST создаем метод и помечаем его аннотацией @PostMapping в параметрах аннотации
указываем URL с которого метод будет принимать параметры
В параметрах метода испоьзуем аннотацию @RequestParam она ставится перед каждой переменной которую необходимо отловить из
POST запроса. Название переменной должно быть таким же как и в форме в значении name.
После этого создаем объект той таблицы (Entity) в которую хотим передать полученные из POST запроса значения
 */
    @PostMapping("/registration")
    public String newUser(@RequestParam String username,
                          @RequestParam String first_name,
                          @RequestParam String last_name,
                          @RequestParam String email,
                          @RequestParam String password,
                          Model model) {

        User user = new User(username, first_name, last_name, email, password);
        userRepository.save(user);

        return "redirect:/";
    }

//
    
}
