package lesson8.Classwork;

public class Device_System {
    public static void main(String[] args) {
        Laptop laptop =new Laptop("HP","Omen");
        Smartphone smartphone =new Smartphone("Iphone","15");
        laptop.charge();
        laptop.connectToWiFi();
        smartphone.charge();
        smartphone.connectToWiFi();
    }
}
