package be.wimdetroyer.visitorindoppresentation.solutions.dop.seed;

import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.Ratings;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.ratings.BadRating;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.ratings.GoodRating;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.ratings.Reviewer;

public class RatingsProvider {

    public static Ratings unrated() {
        return new Ratings(null, null);
    }

    public static Ratings twoGoodRatings() {
        return new Ratings(new GoodRating(new Reviewer("Jeff")), new GoodRating(new Reviewer("Joe")));
    }

    public static Ratings twoBadRatings() {
        return new Ratings(new BadRating(null), new BadRating(null));
    }

    public static Ratings oneGoodOneBadRating() {
        return new Ratings(new GoodRating(new Reviewer("Jeff")), new BadRating(new Reviewer("Jeff")));
    }


}
