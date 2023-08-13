package com.ylmaz.demoprojectecommerce.Repository;

import com.ylmaz.demoprojectecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
