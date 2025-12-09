package lesson20_Lambda.task1;

public class CalculatorDemo {
    public static void main(String[] args) {
        int op1 = 10;
        int op2 = 5;
        MathOperation add = ( a,  b) -> a+b;
        MathOperation sub = (a, b) -> a-b;
        MathOperation mul = (a, b) -> a*b;
        MathOperation div = (a, b) -> {
            if (b!=0){
                return a/b;
            }
            System.out.println("0 a bolmek olmaz");
            return 0;
        };
        System.out.println(add.operate(op1,op2));
        System.out.println(sub.operate(op1,op2));
        System.out.println(mul.operate(op1,op2));
        System.out.println(div.operate(op1,op2));
        System.out.println(div.operate(10,0));
    }
}
