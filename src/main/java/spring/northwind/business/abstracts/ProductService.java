package spring.northwind.business.abstracts;

import org.springframework.data.jpa.repository.Query;
import spring.northwind.core.utilities.results.DataResult;
import spring.northwind.core.utilities.results.Result;
import spring.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    DataResult<List<Product>> getAll();
    Result add(Product product);
    Result delete(Product product);

    DataResult<Product> getByProductName(String productsName);

    DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
