package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Fad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Fads extends CrudRepository<Fad, Long> {
}
