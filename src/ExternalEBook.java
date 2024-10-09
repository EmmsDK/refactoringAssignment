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