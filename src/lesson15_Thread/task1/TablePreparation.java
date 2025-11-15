package lesson15_Thread.task1;

public class TablePreparation extends Thread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 7; i++) {
                System.out.println("Stəkanlar hazırlanır...");
                Thread.sleep(700);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("TablePreparation thread-i dayandırıldı.");
        }
    }
}
