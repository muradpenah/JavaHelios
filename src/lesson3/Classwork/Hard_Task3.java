package lesson3.Classwork;

import java.util.Random;
import java.util.Scanner;

public class Hard_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rad = new Random();
        int a = rad.nextInt(1,100);
        int count=10;
        while (count>0){
            System.out.println("Eded daxil edin: ");
            int b = sc.nextInt();
            if (a==b){
                System.out.println("Qazandiniz");
                break;
            }else {
                count--;
            }
        }
        System.out.println("Uduzdun , canin qalmadi :(");
    }
}
