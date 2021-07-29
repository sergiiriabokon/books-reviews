package com.example.booksreviews.books;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Book {
    @Id
    @SequenceGenerator(name = "books_sequence", 
                       sequenceName = "books_sequence", 
                       allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, 
                    generator = "books_sequence")
    private Long id;
    private String name;
    private LocalDate publishedDate;
    private String author;

    public Book() {
        super();
    }

    public Book(Long id, String name, LocalDate pdate, String author) {
         this.id = id;
         this.name = name;
         this.publishedDate = pdate;
         this.author = author;   
    }

    public Book(String name, LocalDate pdate, String author) {
        this.name = name;
        this.publishedDate = pdate;
        this.author = author;   
   }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" 
                + this.id + ", "
                + this.name + ", "
                + this.author + ", "
                + "}";
    }
}
