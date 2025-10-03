package lesson7.Classwork;

public class Electronic extends Product {
    String brand;

    public Electronic(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Marka: " + brand);
        System.out.println("Qiymət: " + price);
    }
}
