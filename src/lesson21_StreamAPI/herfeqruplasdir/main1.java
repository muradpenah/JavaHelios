package lesson21_StreamAPI.herfeqruplasdir;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "alma", "nar", "banan", "portağal", "kivi", "üzüm", "limon", "qarpız", "gilas", "çiyələk", "armud", "gavali"
        );
        Map<Character, List<String>> map = words.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
