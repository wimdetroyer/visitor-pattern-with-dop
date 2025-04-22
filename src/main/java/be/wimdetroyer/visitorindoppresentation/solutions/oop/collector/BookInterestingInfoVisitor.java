package be.wimdetroyer.visitorindoppresentation.solutions.oop.collector;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.ChildrensTaleBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.FantasyBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.ScifiBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction.NonFictionBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction.ratings.BadRating;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction.ratings.GoodRating;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class BookInterestingInfoVisitor implements BookVisitor {

    private final List<String> interestingInformationCollection = new ArrayList<>();

    // Vanilla OOP implementation.
    @Override
    public void visit(NonFictionBook nonFictionBook) {
        if (!nonFictionBook.interestingnessFactor().isAtleastInteresting()) {
            notifyUninteresting();
            return;
        }

        var ratings = nonFictionBook.ratings();
        var firstRating = ratings.getFirstRating();
        var secondRating = ratings.getSecondRating();
        if (firstRating instanceof GoodRating && secondRating instanceof GoodRating) {
            var firstRatingReviewer = firstRating.getReviewer();
            var secondRatingReviewer = secondRating.getReviewer();
            if (firstRatingReviewer != null && secondRatingReviewer != null) {
                interestingInformationCollection.add("A non-fiction book with two good ratings by " + firstRatingReviewer.getName() + " and " + secondRatingReviewer.getName());
            } else {
                notifyUninteresting();
            }
        } else if (firstRating instanceof BadRating && secondRating instanceof BadRating) {
            interestingInformationCollection.add("A non-fiction book with two bad ratings");
        } else if (firstRating instanceof GoodRating && secondRating instanceof BadRating) {
            var firstRatingReviewer = firstRating.getReviewer();
            if (firstRatingReviewer != null) {
                interestingInformationCollection.add("A non-fiction book with one good first rating by " + firstRatingReviewer.getName() + " and one bad second rating");
            }

        } else {
            notifyUninteresting();
        }

    }

    @Override
    public void visit(ChildrensTaleBook childrensTaleBook) {
        int pages = childrensTaleBook.getPages();
        if (pages == 0) {
            interestingInformationCollection.add("This childrens' book has 0 pages. Use your imagination I suppose.");
        } else if (pages == 100) {
            interestingInformationCollection.add("This childrens' book has exactly 100 pages. interesting somehow!");
        } else if (pages >= 1000) {
            interestingInformationCollection.add("This childrens' book has more than 1000 pages. That's quite long for children!");
        } else {
            notifyUninteresting();
        }
    }

    @Override
    public void visit(FantasyBook fantasyBook) {
        interestingInformationCollection.add("A Fantasybook with summary: " + fantasyBook.getSummary());
    }

    @Override
    public void visit(ScifiBook scifiBook) {
        if (scifiBook.getScifiTheme() == ScifiBook.ScifiTheme.SPACE_EXPLORATION) {
            interestingInformationCollection.add("A Scifibook about space exploration by " + scifiBook.getAuthor());

        } else if (scifiBook.getScifiTheme() == ScifiBook.ScifiTheme.TIME_TRAVEL) {
            interestingInformationCollection.add("A Scifibook about time travel. Here's a summary " + scifiBook.getSummary());
        } else {
            notifyUninteresting();
        }
    }

    public String retrieveInformationCollection() {
        var interestingInformationSummary = interestingInformationCollection.stream().collect(Collectors.joining(System.lineSeparator()));
        var interestingInfoCount = interestingInformationCollection.size();

        return "Found " +
               interestingInfoCount +
               " pieces of interesting information in this book library." +
               System.lineSeparator() +
               System.lineSeparator() +
               "--- Begin Interesting Information ---" +
               System.lineSeparator() +
               System.lineSeparator() +
               interestingInformationSummary +
               System.lineSeparator() +
               System.lineSeparator() +
               "--- End Interesting Information ---";
    }

    private void notifyUninteresting() {
        System.out.println("Found something uninteresting, skipping.");
    }
}