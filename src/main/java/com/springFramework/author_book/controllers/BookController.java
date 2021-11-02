package com.springFramework.author_book.controllers;

import com.springFramework.author_book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/book")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());
        return "list";
    }

}
