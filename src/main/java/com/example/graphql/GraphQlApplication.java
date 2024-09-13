package com.example.graphql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(AuthorRepository authorRepository){
        return args -> {
            Author Simon = authorRepository.save(new Author(null, "Simon", 30));
            Author Sven = authorRepository.save(new Author(null, "Sven", 60));
        };
    }
}
