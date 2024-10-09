import java.util.ArrayList;
import java.util.List;

// Abstract Book class representing different types of books
abstract class Book {
    protected String title;
    protected String author;
    protected String type;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }
}

// Concrete Book class for regular books
class RegularBook extends Book {
    public RegularBook(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }
}

// Adapter class for ExternalEBook to adapt it to the Book interface
class ExternalEBookAdapter extends Book {
    private ExternalEBook externalEBook;

    public ExternalEBookAdapter(ExternalEBook externalEBook) {
        this.externalEBook = externalEBook;
        this.title = externalEBook.getTitle();
        this.author = externalEBook.getAuthor();
        this.type = "ebook";
    }
}

// Factory class for creating books
class BookFactory {
    public static Book createBook(String title, String author, String type) {
        return new RegularBook(title, author, type);
    }

    public static Book createExternalEBookAdapter(ExternalEBook externalEBook) {
        return new ExternalEBookAdapter(externalEBook);
    }
}

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

// ExternalEBook class representing a different type of book
class ExternalEBook {
    private String ebookTitle;
    private String ebookAuthor;

    public ExternalEBook(String ebookTitle, String ebookAuthor) {
        this.ebookTitle = ebookTitle;
        this.ebookAuthor = ebookAuthor;
    }

    public String getTitle() {
        return ebookTitle;
    }

    public String getAuthor() {
        return ebookAuthor;
    }
}

// Main class for testing
public class RefactoredLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding regular books using the factory
        library.addBook(BookFactory.createBook("The Great Gatsby", "F. Scott Fitzgerald", "fiction"));
        library.addBook(BookFactory.createBook("Sapiens", "Yuval Noah Harari", "nonfiction"));

        // Adding an external eBook using the adapter
        ExternalEBook externalEBook = new ExternalEBook("EBook Title", "EBook Author");
        library.addBook(BookFactory.createExternalEBookAdapter(externalEBook));

        // Printing the books in the library
        for (Book book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Type: " + book.getType());
        }
    }
}
