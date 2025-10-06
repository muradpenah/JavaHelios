package lesson8.Classwork;

public class Car extends Vehicle implements Movable , Fuelable {
    int benzin;

    public Car(String name, boolean herketedirmi,  int benzin) {
        super(name,herketedirmi);
        this.benzin = benzin;
    }

    @Override
    public void fuel() {
        if (benzin >=75){
            System.out.println("Benzin doludur");
        } else if (benzin >=50) {
            System.out.println("Benzin hele bes eder");
        }else {
            System.out.println("Benzini doldur, bes etmeyecek");
        }
    }

    @Override
    public void move() {
        if (herketedirmi){
            System.out.println("hazirda hereket edir");
        }else {
            System.out.println("dayanib");
        }
    }
}
