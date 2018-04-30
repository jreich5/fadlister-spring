package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.StatusCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusCodes extends CrudRepository<StatusCode, Long> {
}
