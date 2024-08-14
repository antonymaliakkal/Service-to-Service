package com.projects.author_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException{

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<String> handleException(AuthorNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage() , HttpStatus.NOT_FOUND);
    }

}
