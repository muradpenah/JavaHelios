package lesson11.Classwork.task4;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessorMain {
    public class PaymentProcessor{
        public static void addPayments(List<? super Integer> list){
            list.add(1);
            list.add(2);
            list.add(3);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            }
        }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        PaymentProcessor.addPayments(numbers);
        PaymentProcessor.addPayments(objects);
    }
}
