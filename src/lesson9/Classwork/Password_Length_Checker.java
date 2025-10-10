package lesson9.Classwork;

import java.util.Scanner;

public class Password_Length_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("parol daxil ele: ");
        String parol = scanner.nextLine();
        try{
            if (parol.length()<6){
            throw new InvalidPasswordException("Xeta: parol uzunlugu qisadir");
            }else{
                System.out.println("Qebul edildi");
            }
        }catch (InvalidPasswordException e){
            System.out.println("Xeta: parol uzunlugu qisadir");
        }
    }
}
