import java.util.UUID;

public class Book {
    private int no;
    private String title;
    private String author;
    private int page;
    private String state;

    private static int cnt = 0;


    public Book( String title, String author, int page, String state) {
        this.no = ++cnt;
        this.title = title;
        this.author = author;
        this.page = page;
        this.state = state;
    }

    public void printInfo(){
        System.out.println("-----------------------------");
        System.out.println("도서 번호 : " + this.no);
        System.out.println("도서 제목 : " + this.title);
        System.out.println("도서 저자 : " + this.author);
        System.out.println("페이지 수 : " +  this.page);
        System.out.println("도서 상태 : " + this.state);
        System.out.println("-----------------------------");
    }

    public int getNo() {
        return no;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
