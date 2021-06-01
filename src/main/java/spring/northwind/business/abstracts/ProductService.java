package spring.northwind.business.abstracts;

import org.springframework.data.jpa.repository.Query;
import spring.northwind.core.utilities.results.DataResult;
import spring.northwind.core.utilities.results.Result;
import spring.northwind.entities.concretes.Product;
import spring.northwind.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {

    DataResult<List<Product>> getAll();
    Result add(Product product);
    Result delete(Product product);

    DataResult<List<Product>> getAllSorted();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);

    DataResult<Product> getByProductName(String productsName);

    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
