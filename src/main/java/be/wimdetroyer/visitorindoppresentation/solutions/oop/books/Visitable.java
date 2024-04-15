package be.wimdetroyer.visitorindoppresentation.solutions.oop.books;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.collector.BookVisitor;

public interface Visitable {

    void accept(BookVisitor visitor);
}
