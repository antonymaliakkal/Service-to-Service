package com.projects.author_service.controller;

import com.projects.author_service.model.Author;
import com.projects.author_service.repository.AuthorRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/author")
@EnableDiscoveryClient
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id){
        return authorRepository.findById(id);
    }

}
