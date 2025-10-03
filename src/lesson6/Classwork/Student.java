package lesson6.Classwork;

public class Student {
    private String name;
    private int age;
    private int schoolNumber;

    public Student(String name,int age,int schoolNumber) {
        this.name = name;
        this.age=age;
        this.schoolNumber=schoolNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nAge: "+age+"\nSchool No: "+schoolNumber;
    }
}
