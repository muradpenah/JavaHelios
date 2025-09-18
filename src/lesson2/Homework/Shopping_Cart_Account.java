package lesson2.Homework;

import java.util.Scanner;

public class Shopping_Cart_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kitabin qiymetini daxil edin: ");
        int kitab = sc.nextInt();
        System.out.println("Defterin qiymetini daxil edin: ");
        int defter = sc.nextInt();
        int cem = kitab + defter;
        System.out.println("Sizin umumi mebleg "+cem+" AZN-dir.");
        if (cem>50){
            System.out.println("50 AZN-dən çox alış-verişə görə pulsuz çatdırılma!");
        }
    }
}
