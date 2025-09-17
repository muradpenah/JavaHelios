package lesson1.Classwork;

import java.util.Scanner;

public class coffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cups of coffee are consumed per day?: ");
        int day_coffee = sc.nextInt();
        System.out.println("What is the cost per cup?: ");
        double price_coffee = sc.nextDouble();
        double total = (double)(30 * day_coffee) * price_coffee;
        int employee = day_coffee / 5;
        System.out.println(" Total monthly cost: " + total + " Number of cups per employee: " + employee);
    }
}
