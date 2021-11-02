package com.springFramework.author_book.controllers;

import com.springFramework.author_book.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @RequestMapping("/author")
    public String getAuthor(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return "author/author_list";

    }
}
