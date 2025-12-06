package lesson22_DesignPatterns.Singleton;

public class AppConfig {

    private String theme;
    private String language;
    private static AppConfig instance;

    private AppConfig() {

    }

    public static AppConfig getInstance() {
        if(instance==null) instance = new AppConfig();
        return instance;
    }

    public String getLanguage() {
        return language;
    }

    public String getTheme() {
        return theme;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void displayConfig(){
        System.out.println("Tema "+theme+" olaraq seçilmişdir. ");
    }
}
