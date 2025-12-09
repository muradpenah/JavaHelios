package lesson20_Lambda.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        List<String> sozler = new ArrayList<>();
        sozler.add("Salam");
        sozler.add("Lambda");
        sozler.add("Java");
        Consumer<String> printlength = (a)-> System.out.println(a.length());
        sozler.forEach(printlength);
    }
}
