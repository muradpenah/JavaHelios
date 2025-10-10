package lesson9.Classwork;

import java.util.Scanner;

public class Sade_Hesablama_Kalkulyatoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1ci eded: ");
        String in1 = scanner.nextLine();
        System.out.println("2ci eded: ");
        String in2 = scanner.nextLine();
        System.out.print("Əməliyyat simvolunu daxil edin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        try{
            int a = Integer.parseInt(in1);
            int b = Integer.parseInt(in2);
            int result;
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
        }catch (NumberFormatException e) {
            System.err.println("DAXİLETMƏ XƏTASI: Zəhmət olmasa, tam ədəd daxil edin. Məsələn: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
