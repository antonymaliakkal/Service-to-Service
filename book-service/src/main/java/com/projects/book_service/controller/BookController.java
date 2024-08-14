package com.projects.book_service.controller;

import com.projects.book_service.dto.BookDto;
import com.projects.book_service.feign_client.AuthorClient;
import com.projects.book_service.model.Author;
import com.projects.book_service.model.Book;
import com.projects.book_service.repoistory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorClient authorClient;

    @GetMapping
    public List<BookDto> findAllBook(){
        return  bookRepository.findAll().stream()
                    .map(this::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BookDto finBookById(@PathVariable  Long id){

        Book book = bookRepository.findBookById(id);
        if(book != null){
            return toDto(book);
        }
        else{
            return null;
        }
    }



    public BookDto toDto(Book book){

        Author author = authorClient.getAuthorById(book.getId());

        return new BookDto(book.getId() , book.getTitle() , author);

    }



}
