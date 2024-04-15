package be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction;

import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.Book;

import java.util.EnumSet;
import java.util.Objects;

public record NonFictionBook(
        String isbn,
        String title,
        String author,
        String summary,
        InterestingnessFactor interestingnessFactor,
        Ratings ratings) implements Book {


    public enum InterestingnessFactor {

        MILDLY_INTERESTING,
        INTERESTING,
        LIFE_CHANGING;

        public boolean isAtleastInteresting() {
            return EnumSet.of(INTERESTING, LIFE_CHANGING).contains(this);
        }
    }


    public NonFictionBook {
        Objects.requireNonNull(interestingnessFactor);
        Objects.requireNonNull(ratings);
    }


}
