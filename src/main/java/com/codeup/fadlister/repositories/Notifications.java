package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Notifications extends CrudRepository<Notification, Long> {
}
