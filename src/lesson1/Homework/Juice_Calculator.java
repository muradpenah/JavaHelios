package lesson1.Homework;

import java.util.Scanner;

public class Juice_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Banan shiresi miqdarini daxil et(ml): ");
        int banan = sc.nextInt();
        System.out.println("Kaktus shiresi miqdarini daxil et(ml): ");
        int kaktus = sc.nextInt();
        int shire = banan + kaktus;
        int stekan = shire / 250;
        System.out.println("Vay canına! Bu " + shire + " ml kosmik şirə edir! Bu isə " + stekan + " tam stəkan üçün kifayətdir!");
    }
}
