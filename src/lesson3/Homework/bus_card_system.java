package lesson3.Homework;

import java.util.Scanner;

public class bus_card_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balansınız: ");
        double balans = sc.nextDouble();
        sc.nextLine();
        double bus = 0.7;
        System.out.println("Avtobusa minirsiniz...");
        String choice = sc.nextLine();
        do {
            if (balans>=bus){
               balans-=bus;
               System.out.println("✅ Gediş haqqı ödənildi! Yeni balans: "+balans+" AZN");
           }else {
                System.out.println("❌ Balans kifayət etmir! ("+balans+" AZN)");
                System.out.println("Balans artırmaq istədiyiniz məbləği daxil edin: ");
                double elave = sc.nextDouble();
                sc.nextLine();
                balans+=elave;
                System.out.println("✅ Yeni balans: "+balans+" AZN");
            }
            System.out.println("Avtobusa minirsiniz...");
            choice = sc.nextLine();
        }while(choice.equals("he"));



    }
}
