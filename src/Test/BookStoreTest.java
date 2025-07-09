package Test;

import main.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class BookStoreTest {

    @Test
    void testAddBook(){
        Dashboard.addEbook("4", "test ebook", "pdf", 2020, 30.00);

        EBook book = (EBook) Dashboard.getBook("4");

        assertEquals("4", book.getISBN());
        assertEquals("test ebook", book.getTitle());
        assertEquals("pdf", book.getFileType());
        assertEquals(2020, book.getYear());
        assertEquals(30.00, book.getPrice());

    }

    @Test
    void testRemoveBook(){
        Dashboard.addEbook("5", "test ebook 2", "epub", 2021, 25.00);
        Dashboard.removeBook("5");

        EBook book = (EBook) Dashboard.getBook("5");

        assertNull(book);
    }

    @Test
    void testRemoveOldBooks(){
        Dashboard.addEbook("6", "old book", "pdf", 2010, 15.00);
        Dashboard.addPaperbook("7", "test book", 2022, 20.00, 10 );

        Dashboard.removeBooksOlderThan(2015);

        EBook oldBook = (EBook) Dashboard.getBook("6");
        PaperBook testBook = (PaperBook) Dashboard.getBook("7");

        assertNull(oldBook);
        assertNotNull(testBook);
        assertEquals("test book", testBook.getTitle());
    }

    @Test
    void testBuyBook() throws Exception {
        Customer customer = new Customer("email@email.com", "name", "address");
        Dashboard.addPaperbook("8", "book", 2023, 50.00, 10);

        double payedAmount = customer.buyBook("8", 3);

        PaperBook book = (PaperBook) Dashboard.getBook("8");

        assertEquals(payedAmount,50.00 * 3);
        assertEquals(7, book.getStock());
    }
    


}
