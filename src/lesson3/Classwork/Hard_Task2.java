package lesson3.Classwork;

import java.util.Locale;
import java.util.Scanner;

public class Hard_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Soz daxil edin: ");
        String soz = sc.nextLine().toLowerCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i <soz.length() ; i++) {
            if (soz.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
