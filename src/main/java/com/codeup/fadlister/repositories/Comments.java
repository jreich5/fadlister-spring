package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface Comments extends CrudRepository<Comment, Long> {
}
