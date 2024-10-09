public class ExternalEBookAdapter extends EBook {
    public ExternalEBookAdapter(ExternalEBook externalEBook) {
        super(externalEBook.getTitle(), externalEBook.getAuthor());
    }
}
