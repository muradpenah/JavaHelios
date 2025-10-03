package lesson6.Homework;

public class Manufacturer {
    private String name;
    private int foundationYear;
    private String country;

    // Obyekt yaradılarkən ilkin dəyərləri təyin etmək üçün constructor
    public Manufacturer(String name, int foundationYear, String country) {
        this.name = name; // 'this' cari obyektin sahəsinə istinad edir
        this.foundationYear = foundationYear;
        this.country = country;
    }

    // Obyektin məlumatlarını oxumaq üçün getter metodları
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    // Obyekti mənalı bir string formatında göstərmək üçün toString() metodunu override edirik
    @Override
    public String toString() {
        return name + " (" + country + ", Founded: " + foundationYear + ")";
    }
}

