package lesson15_Thread.task3;

public class metbexde_yemek_hazirlamaq {
    public static void main(String[] args) throws InterruptedException{
            Knife knife = new Knife();
            Thread thread1 = new Thread(new Cook("X",knife));
            Thread thread2 = new Thread(new Cook("Y",knife));
            Thread thread3 = new Thread(new Cook("Z",knife));
            thread1.start();
            thread2.start();
            thread3.start();

    }
}
