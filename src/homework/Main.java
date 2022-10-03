package homework;

public class Main {
    public static void main(String[] args) {
        Author book = new Author("Книга ночи", 2011, "Холли", "Блэк");
        Author book1 = new Author("Конклав", 2019, "Пенелопа", "Дуглас");
        book.getBookInfo();
        book.setPublisherYear(2021);
        book.getBookInfo();
        book1.getBookInfo();
    }
}
