class Member extends Thread {
    private final String name;
    private final Library library;
    private final String bookTitle;

    public Member(String name, Library library, String bookTitle) {
        this.name = name;
        this.library = library;
        this.bookTitle = bookTitle;
    }

    @Override
    public void run() {
        library.borrowBook(name, bookTitle);
        try {
            Thread.sleep(2000); // simulate reading time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        library.returnBook(name, bookTitle);
    }
}