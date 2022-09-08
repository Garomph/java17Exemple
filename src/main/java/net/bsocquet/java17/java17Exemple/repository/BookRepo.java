package net.bsocquet.java17.java17Exemple.repository;

import net.bsocquet.java17.java17Exemple.model.Book;
import net.bsocquet.java17.java17Exemple.model.OldBook;
import net.bsocquet.java17.java17Exemple.model.NewBook;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepo {

    private final List<Book> books;

    public BookRepo() {
        books = new ArrayList<Book>();
        books.add(new OldBook("Martine à la plage", new BigDecimal("15201250150")));
        books.add(new OldBook("Letters from Zhao Mengfu to his friend Guo Tianxi", BigDecimal.valueOf(40500000)));
        books.add(new OldBook("Book Of Mormon", BigDecimal.valueOf(38700000)));
        books.add(new OldBook("Letter from Zeng Gong to his friend", BigDecimal.valueOf(35800000)));
        books.add(new OldBook("Codex Leicester", BigDecimal.valueOf(56300000)));
        books.add(new OldBook("Magna Carta", BigDecimal.valueOf(27900000)));
        books.add(new OldBook("Sherborne Missal", BigDecimal.valueOf(32500000)));
        books.add(new OldBook("Book of Tang", BigDecimal.valueOf(18400000)));
        books.add(new OldBook("St Cuthbert Gospel", BigDecimal.valueOf(16900000)));
        books.add(new OldBook("Bay Psalm Book", BigDecimal.valueOf(16500000)));
        books.add(new NewBook("It Starts with Us", 35));
        books.add(new NewBook("Carrie Soto Is Back", 30));
        books.add(new NewBook("Love on the Brain", 28));
        books.add(new NewBook("Book Lovers", 40));
        books.add(new NewBook("Book of Night", 50));
        books.add(new NewBook("Bloodmarked", 8));
        books.add(new NewBook("Chain of Thorns", 12));
        books.add(new NewBook("The Final Gambit", 19));
        books.add(new NewBook("The American Roommate Experiment", 35));
        books.add(new NewBook("Heartstopper: Volume Five", 29));
    }

    public void addBook(Book book)  {
        books.add(book);
    }

    public List<Book> getBooks()  {
        return books;
    }
}