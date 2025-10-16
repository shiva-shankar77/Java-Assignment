package lamda;
import java.util.*;
@FunctionalInterface
interface Sort{
Comparator<Product> getComparator();
}

class Product {
String name;
double price, rating, discount;
}

public class customer{
public static void main(String[] args) {
   List<Product> products = new ArrayList<>(); // assume list is filled

   String campaign = "price"; 

   Sort strategy = () -> {
       switch (campaign) {
           case "price": return Comparator.comparingDouble(p -> p.price);
           case "rating": return Comparator.comparingDouble((Product p) -> p.rating).reversed();
           case "discount": return Comparator.comparingDouble((Product p) -> p.discount).reversed();
           default: return (a, b) -> 0;
       }
   };

   products.sort(strategy.getComparator());
}
}

