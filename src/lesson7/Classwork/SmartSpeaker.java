package lesson7.Classwork;

public class SmartSpeaker extends SmartDevice{

    public SmartSpeaker(String brand, String model) {
        super(brand, model);

    }

    public void playMusic() {
        if (isOnline) {
            System.out.println("🎵 Musiqi oxudulur... ");
        } else {
            System.out.println("Musiqi oxutmaq üçün cihazı internetə qoşun.");
        }
    }

    @Override
    public void connectToWiFi() {
        super.connectToWiFi();
        if(isOnline){
            System.out.println("🔊 Səsgücləndirici musiqi yayımlamağa hazırdır.");
        }
    }

    @Override
    public void disconnect() {
        System.out.println(brand + " " + model + " musiqi yayımını dayandırdı.");
        super.disconnect();
    }
}
