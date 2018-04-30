package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Notification;
import org.springframework.data.repository.CrudRepository;

public interface Notifications extends CrudRepository<Notification, Long> {
}
