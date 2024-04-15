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
                interestingInformationCollection.add(STR."A non-fiction book with two good ratings by \{firstRatingReviewer.getName()} and \{secondRatingReviewer.getName()}");
            } else {
                notifyUninteresting();
            }
        }
        else if (firstRating instanceof BadRating && secondRating instanceof BadRating) {
            interestingInformationCollection.add("A non-fiction book with two bad ratings");
        } else if (firstRating instanceof GoodRating && secondRating instanceof BadRating) {
            var firstRatingReviewer = firstRating.getReviewer();
            if (firstRatingReviewer != null) {
                interestingInformationCollection.add(STR."A non-fiction book with one good first rating by \{firstRatingReviewer.getName()} and one bad second rating");
            }

        } else {
            notifyUninteresting();
        }

    }

    @Override
    public void visit(ChildrensTaleBook childrensTaleBook) {
        notifyUninteresting();
    }

    @Override
    public void visit(FantasyBook fantasyBook) {
        interestingInformationCollection.add(STR."A Fantasybook with summary: \{fantasyBook.getSummary()}");
    }

    @Override
    public void visit(ScifiBook scifiBook) {
        if(scifiBook.getScifiTheme() == ScifiBook.ScifiTheme.SPACE_EXPLORATION) {
            interestingInformationCollection.add(STR."A Scifibook about space exploration by \{scifiBook.getAuthor()}");

        } else if(scifiBook.getScifiTheme() == ScifiBook.ScifiTheme.TIME_TRAVEL) {
                    interestingInformationCollection.add(STR."A Scifibook about time travel. Here's a summary \{scifiBook.getSummary()}");
        } else {
            notifyUninteresting();
        }
    }



    public String retrieveInformationCollection() {
        var interestingInformationSummary = interestingInformationCollection.stream().collect(Collectors.joining(System.lineSeparator()));
        var interestingInfoCount = interestingInformationCollection.size();
        return STR."""
                Found \{interestingInfoCount} pieces of interesting information in this book library.

                --- Begin Interesting Information ---

                \{interestingInformationSummary}

                --- End Interesting Information ---
                """;
    }

    private void notifyUninteresting() {
        System.out.println("Found something uninteresting, skipping.");
    }
}
