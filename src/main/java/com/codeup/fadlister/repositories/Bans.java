package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Ban;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bans extends CrudRepository<Ban, Long> {
}
