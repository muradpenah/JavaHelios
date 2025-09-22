package lesson4.Classwork;

import java.util.Scanner;

public class Calculate_the_Average_of_Array_Elements {
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
        int sum=0;
        for (int b : arr){
            sum+=b;
        }
        double average = sum / arr.length;
        System.out.println(average);
    }
}
