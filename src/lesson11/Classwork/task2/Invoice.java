package lesson11.Classwork.task2;

public class Invoice {
    private int id;

    public Invoice(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                '}';
    }
}
