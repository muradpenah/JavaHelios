package lesson21_StreamAPI.kvadratihesabla;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> reqemler = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 22);
        List<Integer> list = reqemler.stream().map(x -> x*x).collect(Collectors.toUnmodifiableList());
        System.out.println(list);
    }
}
