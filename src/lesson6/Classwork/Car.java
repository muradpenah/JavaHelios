package lesson6.Classwork;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand,String model,int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "Brand: " + brand +
                "\nModel: " + model +
                "\nYear: " + year ;
    }
}
