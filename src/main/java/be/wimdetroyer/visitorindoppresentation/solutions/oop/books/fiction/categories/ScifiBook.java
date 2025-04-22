package be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.FictionBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.collector.BookVisitor;

public final class ScifiBook extends FictionBook  {


    private final ScifiTheme scifiTheme;


    public ScifiBook(String isbn, String title, String author, String summary, ScifiTheme scifiTheme, int pages) {
        super(isbn, title, author, summary, pages);
        this.scifiTheme = scifiTheme;
    }

    @Override
    public void accept(BookVisitor visitor) {
        visitor.visit(this);
    }


    public enum ScifiTheme {
        SPACE_EXPLORATION,
        ZOMBIE_APOCALYPSE,
        TIME_TRAVEL;
    }

    public ScifiTheme getScifiTheme() {
        return scifiTheme;
    }
}
