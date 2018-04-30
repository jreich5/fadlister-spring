package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface Roles extends CrudRepository<Role, Long> {
}