//import java.util.*;
//
///*
//What's Wrong:
//    - No Design Patterns
//
//Bad Design:
//    - There's no separation of concerns.
//    - Code readability is poor, and it’s prone to errors due to unsafe type casting.
//
//Fix the code:
//
//Hints:
//    - Only design patterns covered so far is used.
//    - There are more than one design pattern in play to solve this properly
//
//Assignment:
//    - Refactor the code!
//    - Explain and argue for the used design patterns
//
//*/
//
//class Lib {
//    List books = new ArrayList();
//
//    void addBook(Object b) {
//        books.add(b);
//    }
//
//    List getBooks() {
//        return books;
//    }
//}
//
//class Book {
//    String title;
//    String author;
//    String type;
//
//    Book(String title, String author, String type) {
//        this.title = title;
//        this.author = author;
//        this.type = type;
//    }
//}
//
//class ExternalEBook {
//    String ebookTitle;
//    String ebookAuthor;
//
//    ExternalEBook(String ebookTitle, String ebookAuthor) {
//        this.ebookTitle = ebookTitle;
//        this.ebookAuthor = ebookAuthor;
//    }
//
//    String getTitle() {
//        return ebookTitle;
//    }
//
//    String getAuthor() {
//        return ebookAuthor;
//    }
//}
//
//public class bad_library {
//    public static void main(String[] args) {
//        Lib library = new Lib();
//
//
//        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "fiction");
//        Book book2 = new Book("Sapiens", "Yuval Noah Harari", "nonfiction");
//
//        library.addBook(book1);
//        library.addBook(book2);
//
//
//        ExternalEBook externalEBook = new ExternalEBook("EBook Title", "EBook Author");
//
//        Book externalBook = new Book(externalEBook.getTitle(), externalEBook.getAuthor(), "ebook");
//        library.addBook(externalBook);
//
//
//        for (Object obj : library.getBooks()) {
//            Book book = (Book) obj;
//            System.out.println("Title: " + book.title + ", Author: " + book.author);
//        }
//    }
//}