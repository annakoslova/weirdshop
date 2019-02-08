package Order;

import Customer.Customer;
import Customer.CustomerController;
import Product.Product;
import Product.ProductController;

import java.util.List;
import java.util.Map;

public interface OrderController{

    void createOrder(Customer customer, Map<Integer, Product> productList);
    void readOrder(int id);
    void closeOrder(int id);
    Map<Integer, Order> allOrders();

    // Create, Close, (Recount), Read (find(see) all products)
}
