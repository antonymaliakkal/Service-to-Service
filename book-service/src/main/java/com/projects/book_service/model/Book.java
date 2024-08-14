package com.projects.book_service.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor

@Data
public class Book {

    private Long id;
    private String title;
    private Long authorId;

}
