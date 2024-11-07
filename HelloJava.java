// Default constructor
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Book {
    private String name;
    private String author;
    private double price;
    private int stock;


    // parameterized constructor for book class
    public Book(String name, String author, double price, int stock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    //getter for each
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public int getStock() {
        return this.stock;
    }

    
}

// admin interaction
class Admin {
    private List<Book> books;

    public Admin() {
        this.books = new ArrayList<>();
    }

    // method to add book
    public void addBook(String name, String author, double price, int stock){
        Book book = new Book(name, author, price, stock);
        books.add(book);

    }

    // method to view newly added book
    public void viewAddedBook() {
            if(books.isEmpty()) {
                System.out.println("No Books Added Yet.");
            } else {
            System.out.printf("%-5s %-30s %-20s%n", "No.", "Title", "Author");
            System.out.println("-------------------------------------------------");

            int count = 1;
            for (Book book: books) {
                System.out.printf("%-5d %-30s %-20s%n", count, book.getName(), book.getAuthor());
                count++;
            }
            System.out.println("------------------------------------------------------");
            System.out.println("TOTAL BOOKS: " + (count - 1));
                }
            }
        
    }





// major update java

public class HelloJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        System.out.print("Title: ");
        String name = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Price: $");
        double price = scanner.nextDouble();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        admin.addBook(name, author, price, stock);
        System.out.println("Book Successfully Added.");
        scanner.nextLine();
        scanner.close();

        admin.viewAddedBook();

        
    }
}