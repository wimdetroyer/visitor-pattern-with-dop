package be.wimdetroyer.visitorindoppresentation.solutions.oop.collector;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.ChildrensTaleBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.FantasyBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.ScifiBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction.NonFictionBook;

public interface BookVisitor {

    void visit(NonFictionBook nonFictionBook);

    void visit(ChildrensTaleBook childrensTaleBook);

    void visit(FantasyBook fantasyBook);

    void visit(ScifiBook scifiBook);
}
