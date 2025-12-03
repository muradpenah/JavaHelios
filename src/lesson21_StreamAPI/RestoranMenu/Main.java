package lesson21_StreamAPI.RestoranMenu;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("Caesar Salad", "Starter", 8.50, true),
                new Dish("Mushroom Soup", "Starter", 5.00, false),
                new Dish("Grilled Chicken", "Main Course", 15.00, true),
                new Dish("Salmon Fillet", "Main Course", 22.50, true),
                new Dish("Vegetable Curry", "Main Course", 12.00, true),
                new Dish("Chocolate Cake", "Dessert", 7.00, true),
                new Dish("Ice Cream", "Dessert", 4.50, false),
                new Dish("Tiramisu", "Dessert", 6.00, true)
        );
        System.out.println("1.Mövcud olmayan yeməkləri tap");
        menu.stream().filter(Dish-> !Dish.isAvailable()).map(Dish::getName).forEach(System.out::println);
        System.out.println("“2.Main Course” kateqoriyasındakı yeməklərin ümumi qiymətini hesabla");
        double mainCourse = menu.stream().filter(Dish -> Dish.getCategory().equals("Main Course")).mapToDouble(Dish::getPrice).sum();
        System.out.println(mainCourse);
        System.out.println("3.Yeməkləri kateqoriyalarına görə qruplaşdır");
        Map<String, List<Dish>> listMap = menu.stream().collect(Collectors.groupingBy(Dish::getCategory));
        listMap.forEach((k,v)-> System.out.println("Yemek: "+k+"\n haqqinda melumat: "+v.toString()));
        System.out.println("4.Hər bir kateqoriyada yeməklərin ortalama qiymətini tap");
        Map<String, Double> stringDoubleMap = menu.stream().collect(Collectors.groupingBy(Dish::getCategory, Collectors.averagingDouble(Dish::getPrice)));
        stringDoubleMap.forEach((k,v)-> System.out.println("Kateqoriya: "+k+" Ortalama qiymet: "+v));
        System.out.println("5. Ən bahalı yeməyi tap");
        Optional<Dish> max = menu.stream().max(Comparator.comparingDouble(Dish::getPrice));
        System.out.println(max);
    }
}
