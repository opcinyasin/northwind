package spring.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.northwind.business.abstracts.ProductService;
import spring.northwind.core.utilities.results.DataResult;
import spring.northwind.core.utilities.results.Result;
import spring.northwind.core.utilities.results.SuccessDataResult;
import spring.northwind.core.utilities.results.SuccessResult;
import spring.northwind.dataAccess.abstracts.ProductDao;
import spring.northwind.entities.concretes.Product;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(productDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add(Product product) {
        productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }


    @Override
    public Result delete(Product product) {
        productDao.delete(product);
        return new SuccessResult("Ürün silindi");
    }
}
