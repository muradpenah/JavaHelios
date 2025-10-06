package lesson8.Classwork;

public class Laptop extends Device implements Chargeable, Connectable{
    public Laptop(String brend, String model) {
        super(brend, model);
    }

    @Override
    public void charge() {
        System.out.println("Brend: "+getBrend()+" Model: "+getModel()+" laptop sarjdadir");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Brend: "+getBrend()+" Model: "+getModel()+" laptop wifi qosuldu");
    }
}
