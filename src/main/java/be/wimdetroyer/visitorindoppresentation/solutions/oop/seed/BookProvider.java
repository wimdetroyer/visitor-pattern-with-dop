package be.wimdetroyer.visitorindoppresentation.solutions.oop.seed;

import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.Book;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.FantasyBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.fiction.categories.ScifiBook;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.nonfiction.NonFictionBook;

import java.util.ArrayList;
import java.util.List;

public class BookProvider {

    public static List<Book> createMockLibrary() {
        List<Book> library = new ArrayList<>();

        // Fiction Books
        FantasyBook fictionBook1 = new FantasyBook(
                "978-1-234567-89-0",
                "The Lost Kingdom",
                "John Smith",
                "In the mystical land of Avaloria, a long-forgotten kingdom resurfaces, bringing with it ancient prophecies and untold dangers."
        );

        FantasyBook fictionBook2 = new FantasyBook(
                "978-1-234567-89-1",
                "Echoes of Eternity",
                "Emily Jones",
                "When a mysterious artifact is discovered, it sets off a chain of events that threatens to unravel the fabric of time itself."
        );

        ScifiBook fictionBook3 = new ScifiBook(
                "978-1-234567-89-2",
                "The Last Stand",
                "David Brown",
                "In a post-apocalyptic world, humanity's last hope lies in a small band of survivors who must confront their inner demons to rebuild civilization.",
                ScifiBook.ScifiTheme.SPACE_EXPLORATION
        );

        FantasyBook fictionBook4 = new FantasyBook(
                "978-1-234567-89-3",
                "Whispers in the Dark",
                "Sarah Adams",
                "When strange whispers begin haunting the residents of a small town, a group of friends embarks on a journey to uncover the truth behind the chilling voices."
        );

        FantasyBook fictionBook5 = new FantasyBook(
                "978-1-234567-89-4",
                "Shadows of Betrayal",
                "Michael Johnson",
                "As kingdoms clash and alliances crumble, a young prince must navigate the treacherous waters of politics and deception to reclaim his rightful throne."
        );

        // Non-Fiction Books
        NonFictionBook nonFictionBook1 = new NonFictionBook(
                        "978-1-234567-90-0",
                        "The Power of Habit",
                        "Charles Duhigg",
                        "Drawing on the latest research in psychology and neuroscience, this book explores the science behind habits and how they shape our lives.",
                NonFictionBook.InterestingnessFactor.LIFE_CHANGING,
                RatingsProvider.unrated()
                );

        NonFictionBook nonFictionBook2 = new NonFictionBook(
                        "978-1-234567-90-1",
                        "Sapiens: A Brief History of Humankind",
                        "Yuval Noah Harari",
                        "From the emergence of Homo sapiens to the present day, this book provides a sweeping narrative of human history and the forces that have shaped our species.",
                NonFictionBook.InterestingnessFactor.LIFE_CHANGING,
                RatingsProvider.twoBadRatings()
                );

        NonFictionBook nonFictionBook3 = new NonFictionBook(
                        "978-1-234567-90-2",
                        "The Subtle Art of Not Giving a F*ck",
                        "Mark Manson",
                        "By embracing the uncomfortable truths of life, this book offers a refreshing approach to living a meaningful and fulfilling existence. ahdiahfuiuf hidfuhaiufhaeiufhf iufhaidzadzadzadazdazdazdazdazdazdazdau",
                NonFictionBook.InterestingnessFactor.LIFE_CHANGING,
                RatingsProvider.twoGoodRatings()
                );

        NonFictionBook nonFictionBook4 = new NonFictionBook(
                        "978-1-234567-90-3",
                        "Educated",
                        "Tara Westover",
                        "A powerful memoir of resilience and self-discovery, this book chronicles the author's journey from a survivalist upbringing to earning a PhD from Cambridge University.",
                NonFictionBook.InterestingnessFactor.INTERESTING,
                RatingsProvider.oneGoodOneBadRating()
                );

        NonFictionBook nonFictionBook5 = new NonFictionBook(
                        "978-1-234567-90-4",
                        "How to Win Friends and Influence People",
                        "Dale Carnegie",
                        "This timeless classic offers practical advice on how to improve communication skills and build meaningful relationships.",
                NonFictionBook.InterestingnessFactor.LIFE_CHANGING,
                RatingsProvider.twoGoodRatings()
                );

        // Add all books to the library
        library.add(fictionBook1);
        library.add(fictionBook2);
        library.add(fictionBook3);
        library.add(fictionBook4);
        library.add(fictionBook5);
        library.add(nonFictionBook1);
        library.add(nonFictionBook2);
        library.add(nonFictionBook3);
        library.add(nonFictionBook4);
        library.add(nonFictionBook5);

        return library;
    }

}
