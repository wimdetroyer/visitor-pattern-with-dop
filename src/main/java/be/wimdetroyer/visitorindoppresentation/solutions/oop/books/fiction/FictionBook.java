package be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction;


import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.Book;

public abstract class FictionBook extends Book {

    public FictionBook(String isbn, String title, String author, String summary) {
        super(isbn, title, author, summary);
    }
}
