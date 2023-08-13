package com.ylmaz.demoprojectecommerce.Service;

import com.ylmaz.demoprojectecommerce.Repository.ProductRepository;
import com.ylmaz.demoprojectecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product save(Product product){
        return productRepository.save(product);
    }

}
