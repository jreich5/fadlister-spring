package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Messages extends CrudRepository<Message, Long> {
}
