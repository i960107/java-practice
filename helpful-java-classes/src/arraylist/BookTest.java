package arraylist;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];
//        }
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
        //얖은 복사
        System.arraycopy(library, 0, copyLibrary, 0, library.length);
        //깊은 복사
        for (int i = 0; i < library.length; i++) {
            copyLibrary[i] = new Book(library[i].getTitle(), library[i].getAuthor());
        }

        List<Book> books = new ArrayList<>();
        books.add(new Book("태백산맥1", "조정래"));
        books.add(new Book("태백산맥2", "조정래"));
        books.add(new Book("태백산맥3", "조정래"));
        books.add(new Book("태백산맥4", "조정래"));
        books.add(new Book("태백산맥5", "조정래"));
        books.add(new Book("태백산맥6", "조정래"));

        List<Book> copyBooks = new ArrayList<>();
        for (Book book: books) {
            copyBooks.add(book.clone());
            book.setAuthor("조정래 작가");
        }
        for(Book book :copyBooks){
            book.showInfo();
        }
    }
}
