import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public void printAllBooks(){
        System.out.println("도서 전체 조회 >>");
        for(Book book : books){
            book.printInfo();
        }
    }

    public void searchBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                System.out.println("도서 검색 : " + title);
                book.printInfo();
            }
        }
    }

    public void borrowBook(int no){
        for(Book book : books){
            if(book.getNo() == no){
                if(book.getState() == "대여가능"){
                    book.setState("대여중");
                    break;
                }
                else System.out.println("대여가능한 도서가 아닙니다.");
            }
            else System.out.println("입력하는 도서번호가 없습니다.");
        }
    }

    public void returnBook(int no){
        for(Book book : books){
            if(book.getNo() == no){
                if(book.getState() == "대여중"){
                    book.setState("정리중");
                    break;
                }
                else System.out.println("대여중인 도서가 아닙니다.");
            }
            else System.out.println("입력하는 도서번호가 없습니다.");
        }
    }

    public void deleteBook(int no){
        for(Book book : books){
            if(book.getNo() == no){
                books.remove(book);
                System.out.println("입력하신 도서번호 " + no + "번의 도서가 삭제되었습니다.");
                break;
            }
        }
    }

    public void lostBook(int no){
        for(Book book : books){
            if(book.getNo() == no){
                if(book.getState() == "대여중"){
                    book.setState("분실");
                    System.out.println("입력하신 도서번호 " + no + "번의 도서가 분실처리 되었습니다.");
                    break;
                }
                else System.out.println("대여중인 도서가 아닙니다.");
            }
            else System.out.println("입력하는 도서번호가 없습니다.");
        }
    }
}
