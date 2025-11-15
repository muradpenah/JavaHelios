package lesson15_Thread.task3;

public class Cook extends Thread implements Runnable {
    private  final String name;
    private final Knife knife;
    public Cook(String name,Knife knife) {
        super(name);
        this.name = name;
        this.knife = knife;
    }

    @Override
    public void run() {
       try {


        synchronized (knife) {
            System.out.printf("\n %s bıçağı götürdü və tərəvəz doğrayır...", name);
            knife.setCount();
            Thread.sleep(1000);
            System.out.printf("\n %s bıçağı buraxdı.", name);
            System.out.println("\n"+knife.getCount());
        }
       } catch (InterruptedException e) {
           System.out.printf("\n Cook %s thread-i dayandirildi. ",name);
       }
    }
}
