package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Fad;
import org.springframework.data.repository.CrudRepository;

public interface Fads extends CrudRepository<Fad, Long> {
}
