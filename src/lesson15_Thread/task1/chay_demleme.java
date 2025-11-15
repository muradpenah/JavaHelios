package lesson15_Thread.task1;

public class chay_demleme {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TeaMaker());
        Thread thread2 = new Thread(new TablePreparation());
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Əsas (Main) thread gözləmə zamanı dayandırıldı.");
        }
        System.out.println("\n=== Bütün proseslər tamamlandı: Çay dəmləndi və stəkanlar hazırdır! ===");
    }
}
