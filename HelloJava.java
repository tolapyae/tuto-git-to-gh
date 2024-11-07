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

    // parameterized constructor for book class
    public Book(String name, String author, double price, int stock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
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

        // for default constructor
        book.displayBook();
        System.out.println("\n");


        //for parameterized constructor
        Book book2 = new Book("Republic", "Plato", 34.5, 4);
        book2.displayBook();
    }
}