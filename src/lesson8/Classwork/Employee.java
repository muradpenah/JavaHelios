package lesson8.Classwork;

public class Employee extends Person implements Workable ,Trainable {

    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Adi: "+name+" Yashi: "+age);
    }

    @Override
    public void attendTraining() {
        System.out.println("Idman edir");
    }

    @Override
    public void work() {
        System.out.println("Ishleyir");
    }

}
