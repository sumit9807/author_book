package com.springFramework.author_book.repository;

import com.springFramework.author_book.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
