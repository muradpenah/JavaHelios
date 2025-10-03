package lesson6.Classwork;

import java.util.Objects;
import java.util.Scanner;

public class Create_Multiple_Car_Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Objects[] cars = new Objects[3];
        System.out.println("--- Car List ---");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + ":");

            System.out.print("Enter brand: ");
            String brandInput = scanner.nextLine();

            System.out.print("Enter model: ");
            String modelInput = scanner.nextLine();

            System.out.print("Enter year: ");
            int yearInput = scanner.nextInt();
            scanner.nextLine();
            Car car = new Car(brandInput, modelInput, yearInput);
            System.out.println(car.toString());
            System.out.println("----------------");
        }
    }
}
