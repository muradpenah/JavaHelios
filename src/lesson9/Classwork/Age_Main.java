package lesson9.Classwork;

import java.util.Scanner;

public class Age_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yash daxil et: ");
        int age = scanner.nextInt();
        Age age1 = new Age(age);
        try {
            System.out.println(age1.checkAge());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
