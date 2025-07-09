package main;

public class PaperBook extends Book implements Shippable, ForSale {
    int stock;
    double price;

    public PaperBook(String ISBN, String title, int year, double price, int stock) {
        super(ISBN, title, year);
        this.price = price;
        this.stock = stock;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
