package lesson20_Lambda.TaskProduct;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductHandler {
    public void ProductHandler
            (List<Product> products,Predicate<Product> filter ,Consumer<Product> action)
    {
        for (Product product: products){
            if (filter.test(product)) action.accept(product);
        }
    }

}
