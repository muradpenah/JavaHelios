package lesson5.Classwork;

import java.util.Scanner;

public class Search_for_a_Name_in_a_String_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Setir sayi daxil et: ");
        int rows = sc.nextInt();
        System.out.println("Sutun sayi daxil et: ");
        int cols = sc.nextInt();
        sc.nextLine();
        String[][] arr = new String[rows][cols];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Sozu daxil et: ");
                arr[i][j] = sc.nextLine();
            }

        }
        System.out.println("Axtardiginiz sozu daxil edin: ");
        String soz = sc.nextLine();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals(soz)){
                    System.out.printf("[%d] -ci setir , [%d] - ci sutun da %s soz tapildi", i+1 , j+1, arr[i][j]);
                }
            }

        }
    }
}
