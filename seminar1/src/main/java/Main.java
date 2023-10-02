import Shop.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product p1 = new Product();
        p1.setCost(1);
        p1.setTitle("первый продукт");
        products.add(p1);

        Product p4 = new Product();
        p4.setCost(4);
        p4.setTitle("четвёртый продукт");
        products.add(p4);

        Product p2 = new Product();
        p2.setCost(2);
        p2.setTitle("второй продукт");
        products.add(p2);

        Product p5 = new Product();
        p5.setCost(5);
        p5.setTitle("пятый продукт");
        products.add(p5);

        Product p3 = new Product();
        p3.setCost(3);
        p3.setTitle("третий продукт");
        products.add(p3);

        Shop shop = new Shop();

        shop.setProducts(products);
        System.out.println(shop.getProducts());
        System.out.println(shop.getMostExpensiveProduct());

        shop.sortProductsByPrice();
        System.out.println(shop.getProducts());

        System.out.println(shop.getMostExpensiveProduct());
    }
}