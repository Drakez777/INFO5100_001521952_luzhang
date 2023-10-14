public class Book {
    String title;
    String author;
    int pageCount;
    String genre;
    String language;
    String publisher;
    int publicationYear;
    String uniqueName;

    Book(String title, String author, int pageCount, String genre, String language, String publisher, int publicationYear, String uniqueName) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
        this.language = language;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.uniqueName = uniqueName;
        System.out.println("Book " + uniqueName + " created.");
    }

    void read() {
    }

    void bookmarkPage() {
    }

    void close() {
    }
}
