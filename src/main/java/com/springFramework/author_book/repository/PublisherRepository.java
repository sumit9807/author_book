package com.springFramework.author_book.repository;

import com.springFramework.author_book.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
