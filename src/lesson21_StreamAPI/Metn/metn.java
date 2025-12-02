package lesson21_StreamAPI.Metn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class metn {
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


        List<String> collect = words.stream().filter(word -> word.length() > 5).collect(Collectors.toList());
        System.out.println(collect);
        collect.stream().mapToInt(String::length).forEach(System.out::println);
        System.out.println(collect.size());
    }
}
