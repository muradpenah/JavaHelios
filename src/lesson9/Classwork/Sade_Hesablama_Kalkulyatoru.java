package lesson9.Classwork;

import java.util.Scanner;

public class Sadə_Hesablama_Kalkulyatoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1ci eded: ");
        double a = scanner.nextDouble();
        System.out.println("2ci eded: ");
        double b = scanner.nextDouble();
        System.out.print("Əməliyyat simvolunu daxil edin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        try{
            double result;
            switch (operator){
                case '+':
                     result=a+b;
                     break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        throw new ArithmeticException("Sıfıra bölmək olmaz.");
                    }
                    result = a / b;
                    break;
                default:
                    throw new CalculatorException("Yanlış əməliyyat simvolu: '" + operator + "'. Zəhmət olmasa, yalnız +, -, *, / simvollarından birini daxil edin.");
            }
        }catch (CalculatorException e) {
            System.err.println("XƏTA: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("RİYAZİ XƏTA: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
