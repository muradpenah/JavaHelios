package lesson2.Classwork;

import java.util.Scanner;

public class Heros_Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qehreamn sechimini reqemle edin: ");
        int a = sc.nextInt();
        String result = switch (a) {
            case 1 ->  "Zeus";
            case 2 ->  "Poseidon";
            case 3 ->  "Kratos";
            default ->  "Invalid";
        };

        System.out.println(result);
    }
}
