package by.rekhaus.raskidayka_thymeleaf.repositoriy;

import by.rekhaus.raskidayka_thymeleaf.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository <Message, Long> {
}
