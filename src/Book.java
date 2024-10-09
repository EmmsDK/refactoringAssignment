public abstract class Book {
    protected String title;
    protected String author;
    protected String type;

    public Book(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Type: " + type;
    }
}
