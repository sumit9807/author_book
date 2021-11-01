package com.springFramework.author_book.bootstrap;

import com.springFramework.author_book.model.Author;
import com.springFramework.author_book.model.Book;
import com.springFramework.author_book.model.Publisher;
import com.springFramework.author_book.repository.AuthorRepository;
import com.springFramework.author_book.repository.BookRepository;
import com.springFramework.author_book.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Jbook","Lucknow");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        System.out.println("Number of Books: " + bookRepository.count());

    }
}
