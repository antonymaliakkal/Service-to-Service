package com.projects.book_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handleException(BookNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage() , HttpStatus.NOT_FOUND);
    }

}
