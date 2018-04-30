package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ratings extends CrudRepository<Rating, Long> {
}
