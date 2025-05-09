package be.wimdetroyer.visitorindoppresentation.solutions.dop;


import be.wimdetroyer.visitorindoppresentation.solutions.dop.books.Book;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.seed.BookProvider;
import be.wimdetroyer.visitorindoppresentation.solutions.dop.collector.BookInterestingInfoCollector;

public class DOPSolution {


    public static void main(String[] args) {
        var mockLibrary = BookProvider.createMockLibrary();
        var booksInterestingInfoCollector = new BookInterestingInfoCollector();
        System.out.println("-- Begin collecting interesting information ---");
        for (Book book : mockLibrary) {
            booksInterestingInfoCollector.collectInterestingInfo(book);
        }
        System.out.println("--- End collecting interesting information ---");
        System.out.println(booksInterestingInfoCollector.retrieveInformationCollection());
    }



}
