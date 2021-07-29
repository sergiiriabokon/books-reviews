package com.example.booksreviews.books;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/books")
public class BooksController {
    private BooksService _booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        super();
        this._booksService = booksService;
    }

    @GetMapping
	public List<Book> getBooks() {
		return this._booksService.getBooks();
	}

    @PostMapping
    public void registerNewBook(@RequestBody Book aBook) {
        this._booksService.addNewBook(aBook);
    }

    @DeleteMapping(path = "{bookId}")
    public void deleteBook(@PathVariable("bookId") Long id) {
        this._booksService.deleteBook(id);
    }

    @PutMapping("/{bookId}")
    public void updateBook(@PathVariable("bookId") Long id, 
                           @RequestBody Book aBook) {
        this._booksService.updateBook(id, aBook);
    }
}

