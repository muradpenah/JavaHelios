package lesson5.Classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Arrange_each_row_separately_in_a_2D_array {
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
        for (int i = 0; i < arr.length ; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
