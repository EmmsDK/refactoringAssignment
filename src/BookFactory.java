public class BookFactory {
    public static Book createBook(String title, String author, String type) {
        switch (type.toLowerCase()) {
            case "physical":
                return new PhysicalBook(title, author);
            case "ebook":
                return new EBook(title, author);
            default:
                throw new IllegalArgumentException("Unknown book type: " + type);
        }
    }
}
