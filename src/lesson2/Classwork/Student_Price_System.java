package lesson2.Classwork;

import java.util.Scanner;

public class Student_Price_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0-100 arasında bir tam ədəd daxil et: ");
        int a = sc.nextInt();
        if (a >= 90) {
            System.out.println(" A Ela");
        } else if (a >= 80) {
            System.out.println(" B Yaxsi");
        } else if (a >= 70) {
            System.out.println(" C Orta");
        } else if (a >= 60) {
            System.out.println("D Kafi");
        } else {
            System.out.println("F qeyri-kafi");
        }

    }
}
