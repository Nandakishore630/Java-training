class Book {

    String title;
    String author;

    // Constructor 1
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor 2
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {

        Book b1 = new Book("The Hobbit", "Tolkien");
        Book b2 = new Book("A Book");

        b1.display();
        b2.display();
    }
}