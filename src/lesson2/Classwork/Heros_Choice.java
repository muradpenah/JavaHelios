package lesson2.Classwork;

import java.util.Scanner;

public class Heros_Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qehreamn sechimini reqemle edin: ");
        int a = sc.nextInt();
        String var10000;
        switch (a) {
            case 1 -> var10000 = "Zeus";
            case 2 -> var10000 = "Poseidon";
            case 3 -> var10000 = "Kratos";
            default -> var10000 = "Invalid";
        }

        String result = var10000;
        System.out.println(result);
    }
}
