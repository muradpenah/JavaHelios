package lesson2.Classwork;

import java.util.Scanner;

public class Age_Verification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yashinizi daxil edin: ");
        int yash = sc.nextInt();
        if (yash >= 18) {
            System.out.println("Girishe icaze verildi");
        } else {
            System.out.println("Giris qadagandir");
        }

    }
}
