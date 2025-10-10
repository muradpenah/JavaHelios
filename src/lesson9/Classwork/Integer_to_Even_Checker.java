package lesson9.Classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Integer_to_Even_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zəhmət olmasa, bir tam ədəd daxil edin: ");
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } catch (NumberFormatException e) {
            System.out.println("Xəta: Daxil etdiyiniz dəyər düzgün tam ədəd deyil.");
        } finally {
            scanner.close();
        }
    }
}
