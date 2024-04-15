package be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction.ratings.Rating;


public final class Ratings {
    private final Rating firstRating;
    private final Rating secondRating;

    public Ratings(Rating firstRating, Rating secondRating) {
        this.firstRating = firstRating;
        this.secondRating = secondRating;
    }

    public Rating getFirstRating() {
        return firstRating;
    }

    public Rating getSecondRating() {
        return secondRating;
    }
}
