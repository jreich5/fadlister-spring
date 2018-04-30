package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Flag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Flags extends CrudRepository<Flag, Long> {
}
