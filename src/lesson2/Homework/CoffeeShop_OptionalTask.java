package lesson2.Homework;

import java.util.Scanner;

public class CoffeeShop_OptionalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1.Espresso      8AZN/ədəd
                2.Cappuccino    6AZN/ədəd
                3.Americano     10AZN/ədəd
                4.Cafe Latte    15AZN/ədəd
                5.Türk qəhvəsi  3AZN/ədəd
                (Seçiminizi rəqəmlə qeyd edin.): 
                """);
        int number = sc.nextInt();
        System.out.println("Yaşınızı daxil edin: ");
        double yash = sc.nextDouble();
        int sum = 0;
        double discount=0;
        switch (number){
            case 1:
              sum=8;
              System.out.println("Espresso hazırdır");
              break;
            case 2:
              sum=6;
              System.out.println("Espresso hazırdır");
              break;
            case 3:
              sum=10;
              System.out.println("Espresso hazırdır");
              break;
            case 4:
              sum=15;
              System.out.println("Espresso hazırdır");
              break;
            case 5:
              sum=3;
              System.out.println("Espresso hazırdır");
              break;
            default:
                System.out.println("Zəhmət olmasa seçiminizi menyu üzərindən etdiyinizə əmin olun!");
        }
        if (yash<=12){
            sum=0;
            System.out.println("Sizin üçün sifarişimiz ödənişsizdir :)");
        } else if (yash<=17) {
            discount= 0.4;
        } else if (yash>=65) {
            discount=yash/100;
        } else{
            discount=0;
        }
        double value = sum *(1-discount);
        System.out.println("Ödəniləcək məbləğ "+value+" AZN, "+sum*discount+" AZN endirim olundu.");
    }
}
