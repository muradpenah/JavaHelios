package lesson2.Classwork;

import java.util.Scanner;

public class Setting_the_time_of_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0-23 arasinda saati yazin: ");
        int saat = sc.nextInt();
        if (saat >= 6 && saat <= 11) {
            System.out.println("Sabahınız xeyir!");
        } else if (saat >= 12 && saat <= 17) {
            System.out.println("Günortanız xeyir!");
        } else if (saat >= 18 && saat <= 22) {
            System.out.println("Axşamınız xeyir!");
        } else {
            System.out.println("Gecəniz xeyir!");
        }

    }
}

