import Customer.Customer;
import Customer.CustomerControllerImpl;
import Order.OrderControllerImpl;
import Product.Product;
import Product.ProductControllerImpl;

import java.util.ArrayList;
import java.util.List;

public class AppShop {

    CustomerControllerImpl customers = new CustomerControllerImpl();
    ProductControllerImpl products = new ProductControllerImpl();
    OrderControllerImpl orders = new OrderControllerImpl();

    public static void main(String[] args) {
        AppShop appShop = new AppShop();

        appShop.customers.registerCustomer("Kate", "new address");
        appShop.customers.registerCustomer("Veronika", "new address1");
        appShop.customers.registerCustomer("Mike", "new address2");

        System.out.println(appShop.customers.allCustomers());
        System.out.println("");

        appShop.products.createProduct("Weed", 10.3, 5.0, false);
        appShop.products.createProduct("Amphetamine", 57, 1.5, false);
        appShop.products.createProduct("Hookah Mix", 23.5, 100, true);

        System.out.println(appShop.products.getProductList());
        System.out.println("");

        appShop.products.readProduct(1);
        appShop.products.updateProduct(2, "Good Tobacco", 11.3, 5.0, true);

        System.out.println(appShop.products.getProductList());
        System.out.println("");

        appShop.products.deleteProduct(1);

        System.out.println(appShop.products.getProductList());
        System.out.println("");

        int a = 0;
        int b = 1;
        appShop.orders.createOrder(appShop.customers.allCustomers().get(a), appShop.products.getProductList());
        appShop.orders.createOrder(appShop.customers.allCustomers().get(b), appShop.products.getProductList());

        System.out.println(appShop.orders.allOrders());
    }
}