package be.wimdetroyer.visitorindoppresentation.solutions.oop.books;



public abstract class Book implements Visitable {

     private final String isbn;
     private final String title;
     private final String author;
     private final String summary;
     private final int pages;
     public Book(String isbn, String title, String author, String summary, int pages) {
          this.isbn = isbn;
          this.title = title;
          this.author = author;
          this.summary = summary;
         this.pages = pages;
     }

     public String getIsbn() {
          return isbn;
     }

     public String getTitle() {
          return title;
     }

     public String getAuthor() {
          return author;
     }

     public String getSummary() {
          return summary;
     }

     public int getPages() {
          return pages;
     }
}
