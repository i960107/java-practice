package object;

class Book {
    private String title;
    private String author;

    @Override
    public String toString() {
        return title + "," + author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        String title = "토지";
        String author = "박경리";
        Book book = new Book(title, author);
        // toString() 오버라이딩 하지 않은 상태 -> class full name@jvm이 인스턴스에 부여한 가상 메모리 주소. 16진수.
        System.out.println(book);
        // 주소가 아닌 값이 출력됨
        System.out.println(title);


    }

}
