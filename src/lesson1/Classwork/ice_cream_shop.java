package lesson1.Classwork;

import java.util.Scanner;

public class ice_cream_shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First icecream price?: ");
        double one = sc.nextDouble();
        System.out.println("Second icecream price?: ");
        double two = sc.nextDouble();
        System.out.println("sum: " + one + two + " first: " + one + " second: " + two + " Divide: " + one % two);
    }
}