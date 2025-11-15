package lesson15_Thread.task1;

public class TeaMaker extends Thread implements Runnable{
    @Override
    public void run() {
              try {
                  for (int i = 1; i <= 5; i++) {
                      System.out.println("Çay dəmlənir..");
                      Thread.sleep(1000);
                  }
              }catch (InterruptedException e){
                  Thread.currentThread().interrupt();
                  System.out.println("TeaMaker thread-i dayandırıldı.");
              }
        }
    }

