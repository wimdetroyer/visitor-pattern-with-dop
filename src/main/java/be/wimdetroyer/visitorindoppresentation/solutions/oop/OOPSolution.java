package be.wimdetroyer.visitorindoppresentation.solutions.oop;


import be.wimdetroyer.visitorindoppresentation.solutions.oop.books.Book;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.seed.BookProvider;
import be.wimdetroyer.visitorindoppresentation.solutions.oop.collector.BookInterestingInfoVisitor;

public class OOPSolution {


    public static void main(String[] args) {
        var mockLibrary = BookProvider.createMockLibrary();
        BookInterestingInfoVisitor booksInterestingInfoVisitor = new BookInterestingInfoVisitor();
        System.out.println("-- Begin collecting interesting information ---");
        for (Book book : mockLibrary) {
            book.accept(booksInterestingInfoVisitor);
        }
        System.out.println("-- End collecting interesting information ---");
        System.out.println(booksInterestingInfoVisitor.retrieveInformationCollection());

    }



}
