package lesson5.Homework;

import java.util.Scanner;

public class QA_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] suallar = {
                {"Azerbaycanin paytaxti?", "A", "A)Baki", "B)Sumgait","C)Gence"},
                {"Fransanin paytaxti?","C" ,"A)Viana", "B)Lyon", "C)Paris"},
                {"Rusiyanin paytaxti?", "B" ,"A)Sankt-Peterburg", "B)Moskva", "C)Rybinsk"}
        };
        int duz = 0;
        int sehv = 0;
        for (int i = 0; i < suallar.length; i++) {
            String answer = suallar[i][1];

            System.out.println("------------------------------------------");
            System.out.println("Sual " + (i + 1) + ": " + suallar[i][0]);
            System.out.println(suallar[i][2]);
            System.out.println(suallar[i][3]);
            System.out.println(suallar[i][4]);

            String cavab;
            boolean dogru = false;

            do {
                System.out.print("\nDogru cavabi qeyd edin: ");
                cavab = sc.nextLine().toUpperCase();

                if (cavab.equals(answer.toUpperCase())) {
                    System.out.println("\n Dogru Cavab!");
                    dogru = true;
                    duz++;
                }
                else {
                    System.out.println("\n Yanlış Giriş. Zəhmət olmasa Dogru cavabi qeyd edin.");
                    sehv++;
                }

            } while (!dogru);
        }


        System.out.println("==========================================");
        System.out.printf("Oyun Bitdi! Təbrik edirik! Siz %d dogru ve %d sehv cavab verdiniz ",duz,sehv );
        System.out.println("\n==========================================");


    }
}