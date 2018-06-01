package com.codeup.fadlister.controllers;

import com.codeup.fadlister.models.Category;
import com.codeup.fadlister.repositories.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin(origins = "http://localhost:4000")
@RestController
public class TestController {

    private final Categories catDao;

    @Autowired
    public TestController(Categories catDao) {
        this.catDao = catDao;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Iterable<Category> getCategories() {
        return catDao.findAll();

    }

}
