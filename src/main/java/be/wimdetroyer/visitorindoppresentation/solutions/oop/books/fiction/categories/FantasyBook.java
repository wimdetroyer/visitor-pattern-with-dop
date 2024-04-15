package be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.FictionBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.collector.BookVisitor;

public final class FantasyBook extends FictionBook {

    public FantasyBook(String isbn, String title, String author, String summary) {
        super(isbn, title, author, summary);
    }

    @Override
    public void accept(BookVisitor visitor) {
        visitor.visit(this);
    }
}
