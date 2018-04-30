package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Profiles extends CrudRepository<Profile, Long> {
}
