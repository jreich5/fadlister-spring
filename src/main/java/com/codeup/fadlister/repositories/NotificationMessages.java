package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.NotificationMessage;
import org.springframework.data.repository.CrudRepository;

public interface NotificationMessages extends CrudRepository<NotificationMessage, Long> {
}
