package lesson6.Classwork;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Book_with_Getters_and_Setters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kitabin adini daxil et: ");
        String kitab = scanner.nextLine();
        System.out.println("Kitabin muellifini daxil et: ");
        String muellif = scanner.nextLine();
        System.out.println("Sehife sayini daxil et: ");
        int count = scanner.nextInt();
        scanner.nextLine();


        Book book = new Book(kitab,muellif,count);

        String name = book.getName();
        System.out.println("Book: "+name);
        System.out.println("Kitabin adini deyis: ");
        kitab = scanner.nextLine();
        book.setName(kitab);
        System.out.println("Sehife sayini deyis: ");
        count = scanner.nextInt();
        book.setPageCount(count);
        System.out.println("Updated Book: "+book.getName()+", Pages: "+book.getPageCount());


        System.out.println(book);
    }


}
