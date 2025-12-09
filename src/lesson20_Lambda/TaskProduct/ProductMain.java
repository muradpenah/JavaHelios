package lesson20_Lambda.TaskProduct;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Laptop X500", 1250.00, "Elektronika"),
                new Product("Qəhvə Dəsti", 45.99, "Mətbəx"),
                new Product("Smartfon S20", 850.50, "Elektronika"),
                new Product("Kitab: Java İrəli Səviyyə", 75.00, "Ədəbiyyat"),
                new Product("Qulaqlıq", 80.00, "Elektronika"),
                new Product("Ofis Masası", 150.00, "Mebel"));

        Predicate<Product> productPredicate = (a)->
                a.getPrice() >100 && a.getCategory().equals("Elektronika");
        Consumer<Product> productConsumer = (a)->
                System.out.printf("Kampaniya üçün Seçildi: %s (Qiymət: %f AZN, Kateqoriya: %s)\n",
                        a.getName(), a.getPrice(), a.getCategory());
        ProductHandler handler = new ProductHandler();
        handler.ProductHandler(productList,productPredicate,productConsumer);
    }
}
