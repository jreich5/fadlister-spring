package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface Messages extends CrudRepository<Message, Long> {
}
