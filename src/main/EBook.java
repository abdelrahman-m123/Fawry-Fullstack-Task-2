package main;

public class EBook extends Book implements Emailable, ForSale{
    private String fileType;
    private double price;

    public EBook(String ISBN, String title, String fileType,int year, double price) {
        super(ISBN, title, year);
        this.fileType = fileType;
        this.price = price;
    }


    public String getFileType() {
        return fileType;
    }


    public double getPrice() {
        return price;
    }

}
