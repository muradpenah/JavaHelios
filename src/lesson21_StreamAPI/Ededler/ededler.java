package lesson21_StreamAPI.Ededler;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ededler {
    public static void main(String[] args) {
        List<Integer> reqemler = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 22);
        Map<String, List<Integer>> map = reqemler.stream().collect(Collectors.groupingBy(x -> (x % 2 == 0) ? "Cut" : "Tek"));
        map.forEach((k ,v) ->System.out.println(k+v));
    }
}
