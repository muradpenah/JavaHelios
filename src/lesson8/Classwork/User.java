package lesson8.Classwork;

public abstract class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void getDetails();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
