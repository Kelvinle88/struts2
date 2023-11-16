package org.example.action;


import java.util.List;
import org.example.model.Product;
import org.example.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
    private final ProductService productService = new ProductService ();
    private List <Product> products;

    public String execute () {
        products = productService.getAllProducts ();
        return SUCCESS;
    }

    public List <Product> getProducts () {
        return products;
    }

    public void setProducts (List <Product> products) {
        this.products = products;
    }
// getters and setters
}

