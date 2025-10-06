package lesson8.Classwork;

public class Smartphone extends Device implements Connectable, Chargeable {
    public Smartphone(String brend, String model) {
        super(brend, model);
    }

    @Override
    public void charge() {
        System.out.println("Brend: "+getBrend()+" Model: "+getModel()+" telefon sarjdadir");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Brend: "+getBrend()+" Model: "+getModel()+" telefon wifiye qosuldu");
    }
}
