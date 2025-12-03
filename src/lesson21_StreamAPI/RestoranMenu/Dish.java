package lesson21_StreamAPI.RestoranMenu;

public class Dish {
    private  String name;
    private  String category;
    private  double price;
    private  boolean available;

    // Constructor
    public Dish(String name, String category, double price, boolean available) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return
                "available=" + available +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price
                ;
    }
}
