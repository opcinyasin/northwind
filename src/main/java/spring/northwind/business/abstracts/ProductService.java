package spring.northwind.business.abstracts;

import spring.northwind.core.utilities.results.DataResult;
import spring.northwind.core.utilities.results.Result;
import spring.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
    Result delete(Product product);
}
