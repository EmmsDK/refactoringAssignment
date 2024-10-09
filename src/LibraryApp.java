public class LibraryApp {
    public static void main(String[] args) {
        Lib library = new Lib();

        // Using the factory to create physical books
        library.addBook(BookFactory.createBook("The Great Gatsby", "F. Scott Fitzgerald", "physical"));
        library.addBook(BookFactory.createBook("Sapiens", "Yuval Noah Harari", "physical"));

        // Using an adapter to add an external eBook
        ExternalEBook externalEBook = new ExternalEBook("EBook Title", "EBook Author");
        library.addBook(new ExternalEBookAdapter(externalEBook));

        // Display books in the library
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
