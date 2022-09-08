package net.bsocquet.java17.java17Exemple.service;

import net.bsocquet.java17.java17Exemple.model.Book;
import net.bsocquet.java17.java17Exemple.model.NewBook;
import net.bsocquet.java17.java17Exemple.model.OldBook;
import net.bsocquet.java17.java17Exemple.repository.BookRepo;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {

    BookRepo repo = new BookRepo();
    LibraryService service = new LibraryService(repo);


    @Test
    void getPublicBook() {
        List<Book> books = service.getPublicBooks();
        assertAll(
                () -> assertNotNull(books),
                () -> assertEquals(books.size(), 10),
                () -> assertTrue(books.stream().allMatch(a -> a instanceof NewBook))
        );
    }

    @Test
    void updatePrice_Value() {
        BigDecimal oldPrice = ((OldBook)repo.getBooks().get(0)).getValue();

        service.updatePrice("0.15");

        BigDecimal newPrice = ((OldBook)repo.getBooks().get(0)).getValue();

        assertEquals(newPrice, oldPrice.multiply(new BigDecimal("0.15")).add(oldPrice));
    }

    @Test
    void updatePrice_Price() {
        double oldprice = ((NewBook)service.getPublicBooks().get(0)).getPrice();

        service.updatePrice("0.15");

        double newprice = ((NewBook)service.getPublicBooks().get(0)).getPrice();

        assertEquals(newprice, oldprice + oldprice*Double.parseDouble("0.15"));
    }

}