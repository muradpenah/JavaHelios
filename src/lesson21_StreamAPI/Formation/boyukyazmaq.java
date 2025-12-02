package lesson21_StreamAPI.Formation;

import java.util.Arrays;
import java.util.List;

public class boyukyazmaq {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "alma", "nar", "banan", "portağal", // Uzunluq: 8 (5-dən >)
                "kivi",
                "üzüm",
                "limon", // Uzunluq: 5 (5-dən > deyil)
                "qarpız", // Uzunluq: 6 (5-dən >)
                "gilas", // Uzunluq: 5 (5-dən > deyil)
                "çiyələk" // Uzunluq: 7 (5-dən >)
        );
        words.stream().forEach((k)-> System.out.println(k.toUpperCase()));
    }
}
