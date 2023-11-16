package org.example.util;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {
    // Mock data for demonstration
    public static List <Product> fetchMockProducts() {
        List<Product> products = new ArrayList <> ();
        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Smartphone", 399.99));
        // Add more products
        return products;
    }
}