package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Flag;
import org.springframework.data.repository.CrudRepository;

public interface Flags extends CrudRepository<Flag, Long> {
}
