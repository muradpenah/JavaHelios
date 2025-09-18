package lesson2.Homework;

import java.util.Scanner;

public class Price_application_for_passenger_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sərnişinin yaşını daxil edin: ");
        int yash = sc.nextInt();
        if (yash<18){
            System.out.println("Uşaq bileti qiyməti: 0.50 AZN");
        } else {
            System.out.println("Normal bilet qiyməti: 1.00 AZN");
        }
    }
}
