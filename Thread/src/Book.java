class Book {
    private final String title;
    private boolean isBorrowed = false;
    private String borrowedBy = null;

    public Book(String title) {
        this.title = title;
    }

    public synchronized boolean borrowBook(String memberName) {
        if (!isBorrowed) {
            isBorrowed = true;
            borrowedBy = memberName;
            System.out.println(memberName + " borrowed \"" + title + "\"");
            return true;
        } else {
            System.out.println(memberName + " tried to borrow \"" + title + "\", but it’s already borrowed by " + borrowedBy + "!");
            return false;
        }
    }

    public synchronized void returnBook(String memberName) {
        if (isBorrowed && memberName.equals(borrowedBy)) {
            isBorrowed = false;
            borrowedBy = null;
            System.out.println(memberName + " returned \"" + title + "\"");
        } else if (!isBorrowed) {
            System.out.println(memberName + " tried to return \"" + title + "\", but it wasn’t borrowed!");
        } else {
            System.out.println(memberName + " tried to return \"" + title + "\", but it was borrowed by " + borrowedBy + "!");
        }
    }
}
