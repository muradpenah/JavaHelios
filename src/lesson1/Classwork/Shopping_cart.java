package lesson1.Classwork;

import java.util.Scanner;

public class Shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First: ");
        int a = sc.nextInt();
        System.out.println("Second: ");
        int b = sc.nextInt();
        System.out.println("Third: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Sum: " + sum + " Average: " + sum / 3 + " First: " + a + " Second: " + b + " Third: " + c);
    }
}
