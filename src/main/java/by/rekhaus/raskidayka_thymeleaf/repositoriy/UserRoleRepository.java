package by.rekhaus.raskidayka_thymeleaf.repositoriy;

import by.rekhaus.raskidayka_thymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
