package be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories;

import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.FictionBook;

public record ScifiBook(
        String isbn,
        String title,
        String author,
        String summary,
        ScifiTheme scifiTheme) implements FictionBook{

    public enum ScifiTheme {
        SPACE_EXPLORATION,
        ZOMBIE_APOCALYPSE,
        TIME_TRAVEL;
    }
}
