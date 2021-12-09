package by.rekhaus.raskidayka_thymeleaf.repositoriy;


import by.rekhaus.raskidayka_thymeleaf.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
