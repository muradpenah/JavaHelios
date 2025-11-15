package lesson15_Thread.task2;

public class pul_cixartmag extends Thread implements Runnable {
    private final String name;

    public pul_cixartmag(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        try{
            System.out.printf("\n %s kartdan pul cixarir...",name);
            Thread.sleep(1000);
            System.out.printf("\n %s pul cixardi ve novbesini bosaltdi.",name);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.printf("pul_cixartmag thread %s -i dayandırıldı.",name);
        }

    }
}
