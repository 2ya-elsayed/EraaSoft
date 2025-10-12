import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Library {
    private final Map<String, Book> books = new HashMap<>();

    public Library(List<String> bookTitles) {
        for (String title : bookTitles) {
            books.put(title, new Book(title));
        }
    }

    public void borrowBook(String memberName, String title) {
        Book book = books.get(title);
        if (book != null) {
            book.borrowBook(memberName);
        } else {
            System.out.println("Book \"" + title + "\" not found in library.");
        }
    }

    public void returnBook(String memberName, String title) {
        Book book = books.get(title);
        if (book != null) {
            book.returnBook(memberName);
        }
    }
}