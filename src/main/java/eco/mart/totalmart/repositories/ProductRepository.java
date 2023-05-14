package eco.mart.totalmart.repositories;

import eco.mart.totalmart.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}