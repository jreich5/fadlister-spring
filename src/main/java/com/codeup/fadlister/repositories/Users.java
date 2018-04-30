package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Users extends CrudRepository<User, Long> {
}
