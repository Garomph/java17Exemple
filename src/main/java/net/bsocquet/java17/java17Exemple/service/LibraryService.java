package net.bsocquet.java17.java17Exemple.service;

import net.bsocquet.java17.java17Exemple.model.Book;
import net.bsocquet.java17.java17Exemple.model.NewBook;
import net.bsocquet.java17.java17Exemple.model.OldBook;
import net.bsocquet.java17.java17Exemple.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private final BookRepo repo;

    public LibraryService(BookRepo repo) {
        this.repo = repo;
    }


    public void updatePrice(String increase) {
        List<Book> books = repo.getBooks();

        for (int i = 0 ; i < books.size(); i ++) {
            if(books.get(i) instanceof OldBook) {
                OldBook book = (OldBook) books.get(i);
                book.setValue(book.getValue().multiply(new BigDecimal(increase)).add(book.getValue()));
            } else if (books.get(i) instanceof NewBook) {
                NewBook book = (NewBook) books.get(i);
                book.setPrice(book.getPrice() + (book.getPrice() * Double.parseDouble(increase)));
            }
        }
    }

    public List<Book> getPublicBooks() {

        List<Book> books = repo.getBooks();
        List<Book> publicBooks = new ArrayList<Book>();

        for (int i = 0 ; i < books.size(); i ++) {
            if(books.get(i) instanceof NewBook) {
                publicBooks.add(books.get(i));
            }
        }
        return publicBooks;

    }
}
