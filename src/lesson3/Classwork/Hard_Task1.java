package lesson3.Classwork;

import java.util.Random;
import java.util.Scanner;

public class Hard_Task1 {
    public static void main(String[] args) {
        Random rad = new Random();
        Scanner sc = new Scanner(System.in);
        int count=3;
        int a = rad.nextInt(1,10);
        while (count>0){
            System.out.println("Tesadufi ededi tap: ");
            int b = sc.nextInt();
            if (a==b){
                System.out.println("Tebrikler!");
            }else {
                count--;
            }
        }
        if (count==0){
            System.out.println("Uduzdunuz!");
        }
    }
}
