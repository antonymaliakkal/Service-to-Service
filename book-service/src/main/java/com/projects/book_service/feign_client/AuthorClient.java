package com.projects.book_service.feign_client;


import com.projects.book_service.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "author-service" , url = "http://localhost:8100")
public interface AuthorClient {

    @GetMapping("/author/{id}")
    Author getAuthorById(@PathVariable Long id);

}
