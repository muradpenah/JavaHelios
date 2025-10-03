package lesson7.Classwork;

public class Book extends Product {
    String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Müəllif: " + author);
        System.out.println("Qiymət: " + price);
    }
}
