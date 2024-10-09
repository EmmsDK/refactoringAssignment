// Factory class for creating books
class BookFactory {
    public static Book createBook(String title, String author, String type) {
        return new RegularBook(title, author, type);
    }

    public static Book createExternalEBookAdapter(ExternalEBook externalEBook) {
        return new ExternalEBookAdapter(externalEBook);
    }
}