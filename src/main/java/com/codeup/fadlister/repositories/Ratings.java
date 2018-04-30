package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Rating;
import org.springframework.data.repository.CrudRepository;

public interface Ratings extends CrudRepository<Rating, Long> {
}
