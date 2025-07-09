package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dashboard {
    public static Map<String, Book> books = new HashMap<>();
    public void Dashboard(){
        addTestBooks();
    }
    public static void addPaperbook(String isbn , String title, int year, double price, int stock){
        books.put(isbn, new PaperBook(isbn, title, year, price, stock));

    }
    public static void addEbook(String isbn, String title, String fileType,int year, double price){
        books.put(isbn, new EBook(isbn, title, fileType, year, price));
    }
    public static void addDemoBook(String isbn, String title, int year){
        books.put(isbn, new Book(isbn, title, year));
    }
    public static void addTestBooks(){
        books.put("1", new PaperBook("1", "Effective Java", 2018, 45.99, 100));
        books.put("2", new PaperBook("2", "Clean Code", 2008, 39.99, 50));
        books.put("3", new EBook("3", "ebook 1", "pdf",2004, 29.99));
    }
    public static void removeBook(String isbn){
        books.remove(isbn);
    }

    public static Book getBook(String isbn){
        return books.get(isbn);
    }

    public static void sendToShippingService(String address){
        System.out.println("address is sent to shipping company");
    }

    public static void sendToMailService(String email){
        System.out.println("email is sent to mail service");
    }

    public static ArrayList removeBooksOlderThan(int year) {
        ArrayList<Book> removedBooks = new ArrayList<>();
        for (String isbn : books.keySet()){
            Book book = books.get(isbn);
            if (book.getYear() < year) {
                removedBooks.add(book);
            }
        }
        for (Book book : removedBooks) {
            books.remove(book.getISBN());
        }
        return removedBooks;
    }



}
