package be.wimdetroyer.visitorindoppresentation.solutions.dop.books;


import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.FictionBook;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.NonFictionBook;

public sealed interface Book permits FictionBook, NonFictionBook {

     String isbn();
     String title();
     String author();
     String summary();
}
