package lesson4.Classwork;

import java.util.Scanner;

public class Create_and_Print_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Eded daxil et: ");
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=a;
            System.out.println(i+1+"-ci element: "+arr[i]);
            System.out.println("Eded daxil et: ");
            a = sc.nextInt();
        }
        for (int b:arr){
            System.out.print(b+" ");
        }
    }
}
