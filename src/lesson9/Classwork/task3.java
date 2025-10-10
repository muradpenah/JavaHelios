package lesson9.Classwork;

public class task3 {
    public static void main(String[] args) {
        try {
            String input = null;
            int uzunluq = input.length();
            System.out.println(uzunluq);
        }catch (NullPointerException e) {
            System.out.println("string bosdu");
        }
            try {
                int a = 5 / 0;
                System.out.println(a);

            } catch (ArithmeticException e) {
                System.out.println("0 a bolmek olmaz");

            }

    }
}