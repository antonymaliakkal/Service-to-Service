package com.projects.book_service.exception;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String message){
        super(message);
    }

}
