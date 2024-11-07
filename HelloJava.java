// Default constructor

class Book {
    private String name;
    private String author;
    private double price;
    private int stock;


    // default constructor for book class
    public Book() {
        this.name = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
        this.stock = 0;
    }

    public void displayBook() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }

    
}

// main 1.0 display default constructor

public class HelloJava {

    public static void main(String[] args) {
        Book book = new Book();
        book.displayBook();
    }
}