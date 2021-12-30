package by.rekhaus.raskidayka_thymeleaf.repository;

import by.rekhaus.raskidayka_thymeleaf.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
