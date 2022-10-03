package homework;

public class Book {
    String bookName;
    int publisherYear;
    public Book(String bookName, int publisherYear) {
        this.bookName = bookName;
        this.publisherYear = publisherYear;
    }
    public String getBookName() {
        return bookName;
    }
    public int getPublisherYear() {
        return publisherYear;
    }
    public void setPublisherYear(int publisherYear) {
        if (publisherYear < 1950 || publisherYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publisherYear);
            return;
        }
        this.publisherYear = publisherYear;
    }
}