package be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories;

import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.FictionBook;

public record FantasyBook(
        String isbn,
        String title,
        String author,
        String summary) implements FictionBook{
}
