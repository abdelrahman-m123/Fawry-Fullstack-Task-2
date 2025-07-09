package main;

public class Customer {
    private String email;
    private String name;
    private String address;

    public Customer(String email, String name, String address) {
        this.email = email;
        this.name = name;
        this.address = address;
    }

    public double buyBook(String isbn, int quantity) throws Exception {
        Book book = Dashboard.getBook(isbn);
        if (book == null) {
            throw new Exception("Book not found");
        }
        if (book instanceof PaperBook) {
            PaperBook paperBook = (PaperBook) book;
            if (paperBook.getStock() < quantity) {
                throw new Exception("there's only " + paperBook.getStock() + " copies available");
            }
            double totalPrice = paperBook.getPrice() * quantity;
            paperBook.setStock(paperBook.getStock() - quantity);
            Dashboard.sendToShippingService(this.address);
            return totalPrice;
        } else if(book instanceof EBook) {
            EBook eBook = (EBook) book;
            Dashboard.sendToMailService(this.email);
            return eBook.getPrice() * quantity;

        }else{
            throw new Exception("This book is not available for sale");
        }
    }

}
