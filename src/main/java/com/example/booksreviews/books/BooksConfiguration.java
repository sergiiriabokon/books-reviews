package com.example.booksreviews.books;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@Configuration
public class BooksConfiguration {
    
    @Bean
    CommandLineRunner commandLineRunner(IBooksRepository booksRepository) {
        return args -> {
            Book neverGiveUp = new Book(1L, 
            "Never give up", 
            LocalDate.of(1995, Month.JANUARY, 20), 
            "Churchill");

            Book personalityTypes = new Book(2L, 
            "Neouroscience of personality", 
            LocalDate.of(205, Month.SEPTEMBER, 20), 
            "Nardi");

            booksRepository.saveAll(
                List.of(neverGiveUp, personalityTypes)
                );


        };
    }
}
