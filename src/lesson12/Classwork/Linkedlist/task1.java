package lesson12.Classwork.Linkedlist;

import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> novbe = new LinkedList<>();
        novbe.add("Elovset");
        novbe.add("Fikret");
        novbe.add("Abdulla");
        for (int i = 0; i < novbe.size(); i++) {
            System.out.println(novbe.get(i));
        }
        novbe.add(0,"Vip-1");
        novbe.remove("Abdulla");
        for (int i = 0; i < novbe.size(); i++) {
            System.out.println(novbe.get(i));
        }
    }
}
