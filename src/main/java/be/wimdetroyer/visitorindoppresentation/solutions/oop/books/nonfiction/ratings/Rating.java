package be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction.ratings;

public abstract class Rating {

    private final Reviewer reviewer;

    public Reviewer getReviewer() {
        return reviewer;
    }

    public Rating(Reviewer reviewer) {
        this.reviewer = reviewer;
    }
}
