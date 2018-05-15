import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booklist;
    private Integer capacity;

    public Library() {
        this.booklist = new ArrayList<>();
        this.capacity = 8;
    }

    public int bookCount() {
        return this.booklist.size();
    }

    public void addBook(Book book) {
        this.booklist.add(book);
    }

    public void checkStock(Book book) {
        if(this.bookCount() < capacity);
        this.booklist.add(book);
    }

    public Book removeBook() {
        return this.booklist.remove(0);
    }

}