package lesson6.Homework;

public class CarSystem {
    public static void main(String[] args) {
        // 1. İki istehsalçı (Manufacturer) obyekti yaradın
        Manufacturer toyota = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");

        // İstehsalçıları çap edin
        System.out.println("=== Manufacturer Info ===");
        System.out.println(toyota); // toyota.toString() avtomatik çağırılır
        System.out.println(bmw);    // bmw.toString() avtomatik çağırılır

        System.out.println(); // Boş sətir əlavə edək

        // 2. Üç fərqli maşın (Car) yaradın
        Car[] cars = {
                new Car("Corolla", toyota, 2020, 1.8, "Petrol", 23.5),
                new Car("Camry", toyota, 2022, 2.5, "Hybrid", 31.7),
                new Car("X5", bmw, 2023, 3.0, "Diesel", 55.9)
        };

        // Bütün maşınları kataloqda göstərin
        System.out.println("=== Car Catalog ===");
        for (Car car : cars) {
            System.out.println(car); // car.toString() avtomatik çağırılır
        }

        System.out.println();

        // 3. Yalnız "Diesel" yanacaq növü olan maşınları filtrləyin
        System.out.println("=== Diesel Cars ===");
        for (Car car : cars) {
            // Yanacaq növünü böyük-kiçik hərf fərqi olmadan yoxlayırıq
            if (car.getFuelType().equalsIgnoreCase("Diesel")) {
                System.out.println(car);
            }
        }

        System.out.println();

        // 4. Yalnız "Germany" mənşəli istehsalçıya aid maşınları filtrləyin
        System.out.println("=== German Manufacturer Cars ===");
        for (Car car : cars) {
            // Maşının istehsalçısının ölkəsini yoxlayırıq
            if (car.getManufacturer().getCountry().equalsIgnoreCase("Germany")) {
                System.out.println(car);
            }
        }
    }
}

