package lesson12.Classwork.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> footballclub = new ArrayList<>();
        footballclub.add("Lewandowski");
        footballclub.add("Yamal");
        footballclub.add("Raphinha");
        footballclub.add("Rashford");
        footballclub.add("Pedri");
        for (int i = 0; i < footballclub.size(); i++) {
            System.out.println(footballclub.get(i));

        }
        System.out.println("------------------------------");
        footballclub.remove("Lewandowski");
        for (int i = 0; i < footballclub.size(); i++) {
            System.out.println(footballclub.get(i));
        }
    }

}
