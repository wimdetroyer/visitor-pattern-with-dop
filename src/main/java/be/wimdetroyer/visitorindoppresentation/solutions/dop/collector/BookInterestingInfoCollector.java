package be.wimdetroyer.visitorindoppresentation.solutions.dop.collector;

import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.Book;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories.ChildrensTaleBook;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories.FantasyBook;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories.ScifiBook.ScifiTheme;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.NonFictionBook;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.fiction.categories.ScifiBook;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.Ratings;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.ratings.BadRating;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.ratings.GoodRating;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.nonfiction.ratings.Reviewer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookInterestingInfoCollector {

    private final List<String> interestingInformationCollection = new ArrayList<>();

    public void collectInterestingInfo(Book book) {
        switch (book) {
            // (1) Guard pattern with a when clause
            case NonFictionBook nonFictionBook when nonFictionBook.interestingnessFactor().isAtleastInteresting() ->
                    collectInterestingInfo(nonFictionBook);
            // (2) record deconstruction, unnamed pattern (_)
            case ScifiBook(_, _, var author, _, _, var scifiTheme) when scifiTheme == ScifiTheme.SPACE_EXPLORATION ->
                    interestingInformationCollection.add("A Scifibook about space exploration by " + author);
            case ScifiBook(_, _, String summary, _,_, var scifiTheme) when scifiTheme == ScifiTheme.TIME_TRAVEL ->
                    interestingInformationCollection.add("A Scifibook about time travel. Here's a short summary " + summary);
            case FantasyBook(_, _, _, String summary,_) ->
                    interestingInformationCollection.add("A Fantasybook with summary: " + summary);
            case ChildrensTaleBook childrensTaleBook -> collectInterestingInfo(childrensTaleBook);
            // (3) multiple scenarios, avoiding default branch to have compile time safety if adding a new book
            case ScifiBook _, NonFictionBook _ -> notifyUninteresting();
        }
    }

    private void collectInterestingInfo(NonFictionBook nonFictionBook) {

        // (4) Nested record deconstruction
        switch (nonFictionBook.ratings()) {
            case Ratings(
                    GoodRating(Reviewer(String firstRatingReviewerName)),
                    GoodRating(Reviewer(String secondRatingReviewerName))
            ) ->
                    interestingInformationCollection.add("A non-fiction book with two good ratings by " + firstRatingReviewerName + " and " + secondRatingReviewerName);
            case Ratings(
                    GoodRating(Reviewer(String firstRatingReviewerName)),
                    BadRating _
            ) ->
                    interestingInformationCollection.add("A non-fiction book with a first good rating by " + firstRatingReviewerName + " and a bad second rating");
            case Ratings(BadRating(_), BadRating(_)) ->
                    interestingInformationCollection.add("A non-fiction book with two bad ratings");
            case Ratings(_, _) -> notifyUninteresting();
        }
    }

    private void collectInterestingInfo(ChildrensTaleBook childrensTaleBook) {

        // (5) https://openjdk.org/jeps/488 - Primitive Types in Patterns (PREVIEW FEATURE!)
        switch (childrensTaleBook.pages()) {
            case 0 -> interestingInformationCollection.add("This childrens' book has 0 pages. Use your imagination I suppose.");
            case 100 -> interestingInformationCollection.add("This childrens' book has exactly 100 pages. interesting somehow!");
            case int i when i >= 1000 -> interestingInformationCollection.add("This childrens' book has exactly 100 pages. interesting somehow!");
            case int _ -> notifyUninteresting();
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