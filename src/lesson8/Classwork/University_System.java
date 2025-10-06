package lesson8.Classwork;

public class University_System {
    public static void main(String[] args) {
        Student student = new Student(15,"Murad","IT");
        Teacher teacher = new Teacher(1,"Eli",300);
        student.takeExam();
        teacher.takeExam();
        teacher.receiveSalary();
    }
}
