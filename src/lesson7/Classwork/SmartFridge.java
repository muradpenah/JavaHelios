package lesson7.Classwork;

public class SmartFridge extends SmartDevice {
    private int coolingLevel;

    public SmartFridge(String brand, String model, int coolingLevel) {
        super(brand, model);
        this.coolingLevel = coolingLevel;

    }

    public void showTemperature() {
        System.out.println("🌡️ Soyuducunun daxili temperaturu: " + (5 - coolingLevel) + "°C");
    }

    @Override
    public void connectToWiFi() {
        super.connectToWiFi();
        if (isOnline) {
            System.out.println("🧊 Soyuducu məhsulların siyahısını sinxronlaşdırır.");
        }
    }

    @Override
    public void disconnect() {
        System.out.println(brand + " " + model + " inventar yeniləməsini dayandırdı.");
        super.disconnect();
    }
}
