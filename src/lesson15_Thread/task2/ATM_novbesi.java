package lesson15_Thread.task2;

public class ATM_novbesi {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new pul_cixartmag("X"));
        Thread thread2 = new Thread(new pul_cixartmag("Y"));
        Thread thread3 = new Thread(new pul_cixartmag("Z"));
        try{
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread gozleme zamani dayandirildi. ");
        }
    }
}
