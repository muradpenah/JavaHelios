package lesson11.Classwork;

public class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                '}';
    }
}
