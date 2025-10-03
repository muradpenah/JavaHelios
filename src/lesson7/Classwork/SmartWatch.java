package lesson7.Classwork;

public class SmartWatch extends SmartDevice{
    private int batteryLevel;

    public SmartWatch(String brand, String model, int batteryLevel) {
        super(brand, model);
        this.batteryLevel = batteryLevel;
    }


    public void trackHeartRate() {
        if (isOnline) {
            System.out.println("⌚ Ürək döyüntüsü izlənilir...");
        } else {
            System.out.println("Zəhmət olmasa, ürək döyüntüsünü izləmək üçün əvvəlcə Wi-Fi-a qoşulun.");
        }
    }

    @Override
    public void connectToWiFi() {
        super.connectToWiFi();
        if(isOnline){
            System.out.println("⌚ Saat artıq məlumat toplayır.");
        }
    }

    @Override
    public void disconnect() {
        System.out.println(brand + " " + model + " məlumat sinxronizasiyasını dayandırdı.");
        super.disconnect();
    }
}
