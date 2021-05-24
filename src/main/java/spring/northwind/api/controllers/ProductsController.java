package spring.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.northwind.business.abstracts.ProductService;
import spring.northwind.core.utilities.results.DataResult;
import spring.northwind.core.utilities.results.Result;
import spring.northwind.entities.concretes.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return productService.add(product);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Product product){
        return productService.delete(product);
    }
}
