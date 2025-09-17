package lesson1.Homework;

import java.util.Scanner;

public class User_Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adinizi daxil edin: ");
        String ad = sc.nextLine();
        System.out.println("Yasinizi daxil edin: ");
        int yash = sc.nextInt();
        System.out.println("Boyunuzu daxil edin: ");
        double boy = sc.nextDouble();
        System.out.println("Salam, " + ad + "! Yasiniz " + yash + " ve boyunuz " + boy + " metrdir.");
    }
}