package lesson2.Homework;

import java.util.Scanner;

public class Ticket_Price_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Film növünü daxil edin (Action, Comedy, Drama, Animation): ");
        String kind = sc.nextLine();
        System.out.println("Həftənin gününü daxil edin (Bazar ertəsi, Şənbə): ");
        String day = sc.nextLine();
        System.out.println("Yaş kateqoriyasını daxil edin (Uşaq, Yetkin, Tələbə): ");
        String yash = sc.nextLine();
        int a = 0;
        int b = 0;
        int discount = 0;
        switch (kind){
            case "Action":
                a=12;
                break;
            case "Comedy":
                a=10;
                break;
            case "Drama":
                a=12;
                break;
            case "Animation":
                a=8;
                break;
            default:
                a=10;
        }
        switch (day){
            case "Şənbə":
                b=2;
                break;
            case "Bazar":
                b=2;
                break;
            default:
                b=0;
        }
        switch (yash){
            case "Uşaq":
                discount=2;
                break;
            case "Tələbə":
                discount=1;
                break;
            default:
                discount=0;
        }
        int sum = a+b-discount;
        System.out.println("Son bilet qiyməti: "+sum);
        System.out.println("(Hesablama: "+kind+" ("+a+") + "+day+" ("+b+") - "+yash+" ("+discount+") = "+sum+")");
    }
}
