package com.projects.book_service.repoistory;

import com.projects.book_service.exception.BookNotFoundException;
import com.projects.book_service.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public BookRepository(){
        books.add(new Book(1L, "1984", 1L));
        books.add(new Book(2L, "Harry Potter", 2L));
        books.add(new Book(3L, "To Kill a Mockingbird", 3L));
        books.add(new Book(4L, "The Lord of the Rings", 4L));
        books.add(new Book(5L, "Pride and Prejudice", 5L));

    }


    public List<Book> findAll() {
        return books;
    }

    public Book findBookById(Long id){
        Optional<Book> book = books.stream()
                                   .filter(b -> b.getId()
                                   .equals(id)).findFirst();

        if(book.isPresent()){
            return book.get();
        }
        else {
            throw new BookNotFoundException("book not found");
        }
    }


}
