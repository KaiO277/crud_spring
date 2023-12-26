package com.demomvc.demo1.controllers;

import com.demomvc.demo1.models.Category;
import com.demomvc.demo1.repositories.CategoryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(path = "categories")
public class CategoryController {
    @Autowired
    private CategoryRepositories categoryRepositories;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategories(ModelMap modelMap) {
        Iterable<Category> categories = categoryRepositories.findAll();
        for (Category category : categories) {
            System.out.println(category.getCategoryID() + ": " + category.getCategoryName());
        }
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("name", "kaio");
        System.out.println("haha"); // For debugging purposes
        return "category";
    }
}
