package assignment1.Q6;


// LibraryResource abstract class
abstract class LibraryResource {
    private String title;
    private String author;

    // Constructor
    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter and setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}

// Book class
class Book extends LibraryResource {
    private int pageCount;

    // Constructor
    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    // Getter and setter methods for pageCount
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + getPageCount());
    }
}

// Magazine class
class Magazine extends LibraryResource {
    private String issueDate;

    // Constructor
    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    // Getter and setter methods for issueDate
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + getIssueDate());
    }
}

// DVD class
class DVD extends LibraryResource {
    private int duration;

    // Constructor
    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    // Getter and setter methods for duration
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration() + " minutes");
    }
}

// LibrarySystem class (Main)
public class LibrarySystem {
    public static void main(String[] args) {
        // Instantiate various library resources
        LibraryResource book = new Book("Java Programming", "John Doe", 500);
        LibraryResource magazine = new Magazine("National Geographic", "Various Authors", "March 2024");
        LibraryResource dvd = new DVD("Inception", "Christopher Nolan", 148);

        // Call displayDetails for each instance to show resource information
        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        dvd.displayDetails();
    }
}
