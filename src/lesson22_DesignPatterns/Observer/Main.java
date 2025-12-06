package lesson22_DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("laptop",1500);
        Customer customer = new Customer("Ali");
        Customer customer1 = new Customer("Vali");
        product.addObserver(customer);
        product.addObserver(customer1);
        product.setNewPrice(2500);
        product.removeObserver(customer1);
        product.setNewPrice(2000);
    }
}
