package lesson6.Classwork;

import java.util.Scanner;

public class Student_with_Constructor_and_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adi daxil et: ");
        String ad = scanner.nextLine();
        System.out.println("Yashi daxil et: ");
        int yash = scanner.nextInt();
        System.out.println("Mekteb nomresi daxil et: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(ad,yash,id);
        System.out.println("Adi daxil et: ");
        ad = scanner.nextLine();
        System.out.println("Yashi daxil et: ");
        yash = scanner.nextInt();
        System.out.println("Mekteb nomresi daxil et: ");
        id = scanner.nextInt();
        System.out.println(student);
        System.out.println("---------------");
        Student student1 = new Student(ad,yash,id);
        System.out.println(student1);
    }
}
