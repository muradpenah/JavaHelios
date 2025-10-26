package lesson11.Classwork.task1;

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
