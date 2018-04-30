package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Image;
import org.springframework.data.repository.CrudRepository;

public interface Images extends CrudRepository<Image, Long> {
}
