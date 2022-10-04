package homework;

public class Main {
    public static void main(String[] args) {
        Author authorHollyBlack = new Author("Холли", "Блэк");
        Author authorPenelopeDouglas = new Author("Пенелопа", "Дуглас");
        Book book1 = new Book("Книга ночи", authorHollyBlack, 2011);
        Book book2 = new Book("Конклав", authorPenelopeDouglas, 2019);
        book1.getBookInfo();
        book2.getBookInfo();
        book1.setPublisherYear(2021);
        book1.getBookInfo();
    }
}
