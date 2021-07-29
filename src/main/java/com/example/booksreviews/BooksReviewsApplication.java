package com.example.booksreviews;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

import com.example.booksreviews.books.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BooksReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksReviewsApplication.class, args);
	}

}

