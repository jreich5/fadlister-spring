package com.codeup.fadlister.repositories;

import com.codeup.fadlister.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Comments extends CrudRepository<Comment, Long> {
}
