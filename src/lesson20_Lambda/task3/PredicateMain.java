package lesson20_Lambda.task3;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<String> uzunluqyoxla = (a)-> a.length()>5;
        System.out.println(uzunluqyoxla.test("Salam"));
        System.out.println(uzunluqyoxla.test("Programmer"));
    }
}
