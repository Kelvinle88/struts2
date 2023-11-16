package org.example.service;

import java.util.List;

import org.example.model.Product;
import org.example.util.DatabaseUtil;

public class ProductService {
    public List<Product> getAllProducts(){
       return DatabaseUtil.fetchMockProducts ();
    }
}
