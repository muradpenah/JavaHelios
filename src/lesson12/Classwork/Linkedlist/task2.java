package lesson12.Classwork.Linkedlist;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> chat = new LinkedList<>();
        chat.add("Salam");
        chat.add("Necesen");
        chat.add("Sagol");
        chat.add("Danisariq");
        String undo = chat.remove(3);
        System.out.println(chat);
        System.out.println("Silinen melumat: "+ undo);
        chat.add(undo);
        System.out.println(chat);
    }
}
