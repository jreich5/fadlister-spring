package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Ban;
import org.springframework.data.repository.CrudRepository;

public interface Bans extends CrudRepository<Ban, Long> {
}
