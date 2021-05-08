package spring.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
    
}
