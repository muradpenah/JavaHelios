package lesson3.Classwork;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Random random = new Random();
            int rad = random.nextInt(1,100);
            System.out.println(rad);
        }
    }
}
