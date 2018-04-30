package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.NotificationMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotificationMessages extends CrudRepository<NotificationMessage, Long> {
}
