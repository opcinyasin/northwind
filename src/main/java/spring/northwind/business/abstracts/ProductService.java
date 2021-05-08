package spring.northwind.business.abstracts;

import spring.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

}
