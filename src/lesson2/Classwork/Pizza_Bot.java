package lesson2.Classwork;

import java.util.Scanner;

public class Pizza_Bot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sevdiiyiniz pizza adini daxil edin: ");
        String pizza = sc.nextLine();
        if (pizza.equalsIgnoreCase("pepperoni")) {
            System.out.println("pepperoni hazirdir");
        } else if (pizza.equalsIgnoreCase("margherita")) {
            System.out.println("margherita hazirdir");
        } else {
            System.out.println(pizza + " menyumuzda movcud deyil");
        }

    }
}
