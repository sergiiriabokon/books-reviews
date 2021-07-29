package com.example.booksreviews.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.time.LocalDate;

@Service
public class BooksService {

    private final IBooksRepository _booksRepository;
    
    @Autowired
    public BooksService(IBooksRepository booksRepo) {
        super();
        this._booksRepository = booksRepo;
    }

    public List<Book> getBooks() {
        return this._booksRepository.findAll();
	}

    public void addNewBook(Book aBook) throws IllegalStateException {
        Optional<Book> b = this._booksRepository.findBookByName(aBook.getName());
        if(b.isPresent()) {
            throw new IllegalStateException("Book with this name is already present");
        }
        this._booksRepository.save(aBook);
        System.out.println(aBook);
    }

    public void deleteBook(Long bookId) {
        boolean isPresent = this._booksRepository.existsById(bookId);
        if(isPresent) {
            this._booksRepository.deleteById(bookId);
        }
    }
}
