package be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories;

import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.FictionBook;

public record ChildrensTaleBook(
        String isbn,
        String title,
        String author,
        String summary, int pages) implements FictionBook {
}
