//package by.rekhaus.raskidayka_thymeleaf.controller;
//
//import by.rekhaus.raskidayka_thymeleaf.entity.User;
//import by.rekhaus.raskidayka_thymeleaf.repositoriy.UserrRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@org.springframework.stereotype.Controller
//public class Controller {
//
//    private final UserrRepository userrRepository;
//
//    @Autowired
//    public Controller(UserrRepository userrRepository) {
//        this.userrRepository = userrRepository;
//    }
//
//    @GetMapping("/test")
//    public String test() {
//        User user = new User();
//        Role role = new Role();
//        role.setRole("ADMIN");
//        role.setUser(user);
//        user.setRole(role);
//
//        userrRepository.save(user);
//        return "index";
//    }
//}
