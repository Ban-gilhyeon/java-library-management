public class MainTest {
    public static void main(String[] args) {
        Book bookTest = new Book("test1", "test1", 100, "대여가능");
        Book bookTest2 = new Book("test2", "test2", 100, "대여가능");
        Book bookTest3 = new Book("test3", "test3", 20, "대여중");
        Library library = new Library();

        library.addBook(bookTest);
        library.addBook(bookTest2);
        library.addBook(bookTest3);

        library.borrowBook(1);
        library.printAllBooks();

        library.deleteBook(2);
        library.printAllBooks();

        library.lostBook(3);
        library.printAllBooks();
    }
}