package by.rekhaus.raskidayka_thymeleaf.repositoriy;

import by.rekhaus.raskidayka_thymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserrRepository extends JpaRepository<User, Long> {
}
