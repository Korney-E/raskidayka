package by.rekhaus.raskidayka_thymeleaf.controllers;

import by.rekhaus.raskidayka_thymeleaf.model.User;
import by.rekhaus.raskidayka_thymeleaf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @Autowired
    UserRepository userRepository;


    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Раскидайка");
        return "index";
    }

    @RequestMapping("/index_auth")
    public String index_auth(Model model) {
        model.addAttribute("title", "Раскидайка");
        return "index_auth";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        return "about";
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
    public String newUser(@RequestParam String email,
                          @RequestParam String first_name,
                          @RequestParam String last_name,
                          @RequestParam String password,

                          Model model) {
        User user = new User(email, first_name, last_name, password);
        userRepository.save(user);

        return "redirect:/";
    }

    @RequestMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("title", "Панель администратора");
        return "admin/admin";
    }

    @GetMapping("/admin/toys_index")
    public String admin_toys_index(Model model) {
//        model.put("message");
        return "/admin/toys/toys_index";
    }
}