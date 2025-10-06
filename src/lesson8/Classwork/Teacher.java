package lesson8.Classwork;

public class Teacher extends User implements  ExamParticipant, Payable {
    private int salary;

    public Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void getDetails() {
        System.out.println(getId()+" ->id Name: "+getName()+" muellim");
    }

    @Override
    public void takeExam() {
        getDetails();
        System.out.println("Mellim imtahana nezaret edir");
    }

    @Override
    public void receiveSalary() {
        getDetails();
        System.out.println(getSalary()+" maashin");
    }
}
