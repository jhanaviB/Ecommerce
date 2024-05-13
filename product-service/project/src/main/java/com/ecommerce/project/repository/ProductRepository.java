package com.ecommerce.project.repository;

import org. springframework.data.mongodb.repository.MongoRepository;
import com.ecommerce.project.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
}
