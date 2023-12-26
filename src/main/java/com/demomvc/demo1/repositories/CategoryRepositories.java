package com.demomvc.demo1.repositories;

import com.demomvc.demo1.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositories extends CrudRepository<Category, String> {
}
