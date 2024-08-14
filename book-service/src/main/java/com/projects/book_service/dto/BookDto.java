package com.projects.book_service.dto;

import com.projects.book_service.model.Author;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@AllArgsConstructor
//@Component
@Getter
@Service
@NoArgsConstructor
public class BookDto {

    private  Long id;
    private String title;
    private Author author;



}
