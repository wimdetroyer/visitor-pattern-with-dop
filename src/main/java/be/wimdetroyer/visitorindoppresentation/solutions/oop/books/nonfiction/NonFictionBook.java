package be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.Book;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.collector.BookVisitor;

import java.util.EnumSet;
import java.util.Objects;

public final class NonFictionBook extends Book {

    private final InterestingnessFactor interestingnessFactor;
    private final Ratings ratings;

    @Override
    public void accept(BookVisitor visitor) {
        visitor.visit(this);
    }

    public enum InterestingnessFactor {

        MILDLY_INTERESTING,
        INTERESTING,
        LIFE_CHANGING;

        public boolean isAtleastInteresting() {
            return EnumSet.of(INTERESTING, LIFE_CHANGING).contains(this);
        }
    }


    public NonFictionBook(String isbn, String title, String author, String summary, int pages, InterestingnessFactor interestingnessFactor, Ratings ratings) {
        Objects.requireNonNull(interestingnessFactor);
        Objects.requireNonNull(ratings);
        super(isbn, title, author, summary, pages);
        this.interestingnessFactor = interestingnessFactor;
        this.ratings = ratings;
    }


    public InterestingnessFactor interestingnessFactor() {
        return interestingnessFactor;
    }

    public Ratings ratings() {
        return ratings;
    }

}
