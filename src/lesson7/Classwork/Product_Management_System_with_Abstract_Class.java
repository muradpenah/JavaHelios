package lesson7.Classwork;

public class Product_Management_System_with_Abstract_Class {
    public static void main(String[] args) {
        Product book = new Book("Səfillər", 15.50, "Victor Hugo");
        Product electronic = new Electronic("iPhone 15 Pro", 2500.00, "Apple");
        System.out.println("Endirimdən əvvəlki vəziyyət:\n");
        book.displayInfo();
        electronic.displayInfo();
        System.out.println("\n Endirimlər tətbiq olunur...\n");
        book.applyDiscount(10);
        electronic.applyDiscount(5);
        System.out.println("\n Endirimdən sonrakı vəziyyət:\n");
        book.displayInfo();
        electronic.displayInfo();
    }
}
