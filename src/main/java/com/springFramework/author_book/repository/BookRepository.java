package com.springFramework.author_book.repository;

import com.springFramework.author_book.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
