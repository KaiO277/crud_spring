package com.demomvc.demo1.repositories;

import com.demomvc.demo1.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepositories extends CrudRepository<Product, String> {
    Iterable<Product> findByCategoryID(String categoryID);
}
