package by.rekhaus.raskidayka_thymeleaf.repositoriy;

import by.rekhaus.raskidayka_thymeleaf.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
