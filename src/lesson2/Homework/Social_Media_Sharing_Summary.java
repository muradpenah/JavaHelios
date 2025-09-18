package lesson2.Homework;

import java.util.Scanner;

public class Social_Media_Sharing_Summary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Paylaşımın mətn uzunluğunu daxil edin: ");
        int length = sc.nextInt();
        System.out.println("Şəkil var? (true/false): ");
        boolean sekil = sc.nextBoolean();
        System.out.println("Bəyənilmə sayını daxil edin: ");
        int count = sc.nextInt();
        if (length>100 || count>500){
            System.out.println("Populyar paylaşımdır.");
        } else if (sekil && length>50) {
            System.out.println("Maraqlı paylaşımdır.");
        }else {
            System.out.println("Standart paylaşımdır.");
        }
    }
}
