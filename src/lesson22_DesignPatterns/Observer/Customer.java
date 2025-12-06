package lesson22_DesignPatterns.Observer;

public class Customer implements ProductObserver {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String productName, double newPrice) {
        System.out.printf("Hörmətli %s, %s məhsulunun yeni qiyməti: %f AZN",this.customerName,productName,newPrice);
        System.out.println("\n-------------------------------------------------");
    }

    public String getCustomerName() {
        return customerName;
    }
}
