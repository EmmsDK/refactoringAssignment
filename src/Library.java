import java.util.ArrayList;
import java.util.List;

// Library class with generic type to ensure type safety
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}