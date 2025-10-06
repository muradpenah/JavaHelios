package lesson8.Classwork;

import java.util.Scanner;

public class Car_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adi daxil et: ");
        String ad = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Benzin miqdarini daxil et: ");
        int benzin = scanner.nextInt();
        System.out.println("HereketEdirmi(true,false): ");
        boolean move= scanner.nextBoolean();
        Car car = new Car(ad,move,benzin);
        car.move();
        car.fuel();
    }
}
