package lesson6.Homework;

public class Car {
    private String model;
    private Manufacturer manufacturer; // Car sinifi Manufacturer sinifindən bir obyekt saxlayır
    private int productionYear;
    private double engineSize;
    private String fuelType;
    private double price; // Qiymət min dollarla (məs: 23.5)

    // Constructor
    public Car(String model, Manufacturer manufacturer, int productionYear, double engineSize, String fuelType, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.price = price;
    }

    // Filtrasiya və məlumat əldə etmək üçün getter metodları
    public String getFuelType() {
        return fuelType;
    }

    public double getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    // Obyekti tam və anlaşılan şəkildə göstərmək üçün toString() override olunur
    @Override
    public String toString() {
        // Məsələn: Corolla | Toyota | 2020 | 1.8L | Petrol | $23.5K
        return model + " | " +
                manufacturer.getName() + " | " + // Manufacturer obyektinin adını alırıq
                productionYear + " | " +
                engineSize + "L | " +
                fuelType + " | $" +
                price + "K";
    }
}
