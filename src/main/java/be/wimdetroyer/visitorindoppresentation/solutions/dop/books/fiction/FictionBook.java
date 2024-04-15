package be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction;


import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.Book;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories.ChildrensTaleBook;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories.FantasyBook;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories.ScifiBook;

public sealed interface FictionBook extends Book permits ChildrensTaleBook, FantasyBook, ScifiBook {

}
