package homework;

public class Author extends Book{
    String authorSurname;
    String authorName;
    public Author(String bookName, int publisherYear, String authorSurname, String authorName) {
        super(bookName, publisherYear);
        this.authorSurname = authorSurname;
        this.authorName = authorName;
    }
    public String getAuthorSurname() {
        return authorSurname;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void getBookInfo(){
        System.out.println("Книга «"+ getBookName() +"» (Автор — "+ getAuthorSurname() +" "+ getAuthorName()+")"+" издана в "+getPublisherYear()+" году.");
    }
}
