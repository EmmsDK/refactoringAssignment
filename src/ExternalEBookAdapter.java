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