package com.projects.author_service.repository;

import com.projects.author_service.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class AuthorRepository {

    private List<Author> authors = new ArrayList<>();

    public AuthorRepository(){
        authors.add(new Author(1L, "George Orwell"));
        authors.add(new Author(2L, "J.K. Rowling"));
        authors.add(new Author(3L, "Harper Lee"));
        authors.add(new Author(4L, "J.R.R. Tolkien"));
        authors.add(new Author(5L, "Jane Austen"));
    }

    public List<Author> findAll(){
        return authors;
    }

    public Author findById(Long id){
        Author author = new Author();

        Optional<Author> author1 = authors.stream()
                                    .filter(a -> a.getId().equals(id)).findFirst();

        if(author1.isPresent()){
            return author1.get();
        }
        else {
            return null;
        }
    }

}
