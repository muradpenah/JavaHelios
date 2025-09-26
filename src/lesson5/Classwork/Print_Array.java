package lesson5.Classwork;

import java.util.Scanner;

public class Print_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Setir sayi daxil et: ");
        int rows = sc.nextInt();
        System.out.println("Sutun sayi daxil et: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Ededi daxil et: ");
                arr[i][j] = sc.nextInt();
            }

        }
        for (int[] a : arr){
            for (int b : a){
                System.out.println(b+" ");
            }
            System.out.println();

        }
    }
}
