package lesson22_DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        config1.setTheme("Dark");
        config2.displayConfig();
        if (config1==config2) System.out.println(true);
    }
}
