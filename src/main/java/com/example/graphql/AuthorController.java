package com.example.graphql;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    @QueryMapping()
    Iterable<Author> authors () {
        return  authorRepository.findAll();
    }
}

