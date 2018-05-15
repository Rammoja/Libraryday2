import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowTest {

    Borrow borrow;
    Book book;
    Library library;


    @Before
    public void before() {
        library = new Library();
        book = new Book();
        borrow = new Borrow();
    }

}