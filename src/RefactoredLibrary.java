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