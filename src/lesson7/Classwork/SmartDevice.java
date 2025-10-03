package lesson7.Classwork;

public class SmartDevice {
    protected String brand;
    protected String model;
    protected Boolean isOnline=false;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void connectToWiFi(){
        if (!isOnline) {
            this.isOnline = true;
            System.out.println(brand + " " + model + " internetə qoşuldu.");
        } else {
            System.out.println(brand + " " + model + " artıq internetə qoşuludur.");
        }
    }
    public void disconnect(){
        if (isOnline) {
            this.isOnline = false;
            System.out.println(brand + " " + model + " internetdən ayrıldı.");
        } else {
            System.out.println(brand + " " + model + " artıq offline vəziyyətdədir.");
        }
    }
    public boolean isOnline() {
        return isOnline;
    }
}
