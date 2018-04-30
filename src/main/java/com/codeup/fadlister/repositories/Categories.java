package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface Categories extends CrudRepository<Category, Long> {
}
