package lesson2.Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin: ");
        int one = sc.nextInt();
        System.out.println("İkinci ədədi daxil edin: ");
        int two = sc.nextInt();
        sc.nextLine();
        System.out.println("Operatoru daxil edin (+, -, *, /): ");
        char operation = sc.nextLine().charAt(0);
        int a = 0;
        switch (operation){
            case '+':
                a=one+two;
                System.out.println(a);
                break;
            case '-':
                a=one-two;
                System.out.println(a);
                break;
            case '*':
                a=one*two;
                System.out.println(a);
                break;
            case '/':
                if (two==0){
                    System.out.println("Sıfıra bölmə mümkün deyil!");
                } else {
                    a=one/two;
                    System.out.println(a);
                }
                break;
            default:
                System.out.println("Tanınmayan operator!");
        }
    }
}
