package lesson2.Homework;

import java.util.Scanner;

public class Food_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                 1.Süd: 2.50 AZN/ədəd
                 2.Çörək: 1.20 AZN/ədəd
                 3.Yumurta: 0.30 AZN/ədəd
                """);
        System.out.println("Məhsulun adını daxil edin: ");
        String food = sc.nextLine();
        System.out.println("Miqdarını daxil edin: ");
        int count = sc.nextInt();
        double value = 0.00;
        switch (food){
            case "Süd":
                value = 2.50;
                break;
            case "Çörək":
                value = 1.20;
                break;
            case "Yumurta":
                value = 0.30;
                break;
            default:
                System.out.println("Məhsul mövcud deyil");
        }
        double sum = value * count;
        double discount = 0;
        if (sum>10){
            discount = 0.05;
        } else if (sum>5){
            discount = 0.02;
        }else {
            System.out.println("Endirim olmayacaq.");
        }
        double a = sum * discount;
        double b = sum - a;
        System.out.println("Məhsul: "+food);
        System.out.println("Miqdar: "+count);
        System.out.println("İlkin məbləğ: "+sum+" AZN");
        System.out.println("Tətbiq olunan endirim: "+discount*100+"% "+"("+a+" AZN)");
        System.out.println("Son məbləğ: "+b+" AZN");
    }
}
