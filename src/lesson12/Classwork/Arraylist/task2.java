package lesson12.Classwork.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>();
        menu.add("doner");
        menu.add("pide");
        menu.add("lahmacun");
        System.out.println(menu.size());
        for (int i = 0; i < menu.size() ; i++) {
            System.out.println(menu.get(i));
        }
        menu.add("chefin speciali");
        System.out.println(menu.size());
        for (int i = 0; i < menu.size() ; i++) {
            System.out.println(menu.get(i));
        }
    }
}
