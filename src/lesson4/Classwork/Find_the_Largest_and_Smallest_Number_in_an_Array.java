package lesson4.Classwork;

import java.util.Scanner;

public class Find_the_Largest_and_Smallest_Number_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Eded daxil et: ");
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=a;
            System.out.println(i+1+"-ci element: "+arr[i]);
            System.out.println("Eded daxil et: ");
            a = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];
        }
        System.out.println("en boyuk eded: "+max+" , "+"en kicik eded: "+min);
    }
}
