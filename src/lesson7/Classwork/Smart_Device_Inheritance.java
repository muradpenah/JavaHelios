package lesson7.Classwork;

public class Smart_Device_Inheritance {
    public static void main(String[] args) {
       SmartWatch watch = new SmartWatch("Apple", "Watch Series 9",85);
       SmartSpeaker speaker = new SmartSpeaker("Amazon", "Echo Dot");
       SmartFridge fridge = new SmartFridge("Samsung", "SmartCool 3000", 4);
        System.out.println("---------- SmartWatch Testi ----------");
        watch.connectToWiFi();
        watch.trackHeartRate();
        watch.disconnect();

        System.out.println("\n---------- SmartSpeaker Testi ----------");
        speaker.connectToWiFi();
        speaker.playMusic();
        speaker.disconnect();

        System.out.println("\n---------- SmartFridge Testi ----------");
        fridge.connectToWiFi();
        fridge.showTemperature();
        fridge.disconnect();
    }
}
