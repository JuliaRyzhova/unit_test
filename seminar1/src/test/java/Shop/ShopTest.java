package Shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    private List<Product> products;
    private List<Product> clonedProducts;

    @BeforeEach
    void initShopProducts() {
        products =  new ArrayList<>();
        clonedProducts =  new ArrayList<>();

        Product p1 = new Product();
        p1.setCost(1);
        p1.setTitle("первый продукт");
        products.add(p1);
        clonedProducts.add(p1);

        Product p4 = new Product();
        p4.setCost(4);
        p4.setTitle("четвёртый продукт");
        products.add(p4);
        clonedProducts.add(p4);

        Product p2 = new Product();
        p2.setCost(2);
        p2.setTitle("второй продукт");
        products.add(p2);
        clonedProducts.add(p2);

        Product p5 = new Product();
        p5.setCost(5);
        p5.setTitle("пятый продукт");
        products.add(p5);
        clonedProducts.add(p5);

        Product p3 = new Product();
        p3.setCost(3);
        p3.setTitle("третий продукт");
        products.add(p3);
        clonedProducts.add(p3);
    }

    @Test
    void testGetProducts() {
        Shop shop = new Shop();
        shop.setProducts(products);
        assertThat(shop.getProducts()).isEqualTo(clonedProducts);
    }

    @Test
    void testSortProductsByPrice() {
    }

    @Test
    void testGetMostExpensiveProduct() {
    }
}