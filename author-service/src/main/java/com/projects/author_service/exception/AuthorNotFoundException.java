package com.projects.author_service.exception;

import com.projects.author_service.model.Author;

public class AuthorNotFoundException extends  RuntimeException{

    public AuthorNotFoundException(String message){
        super(message);
    }

}
