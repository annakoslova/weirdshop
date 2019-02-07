package Order;

import Customer.Customer;
import Customer.CustomerController;
import Product.Product;
import Product.ProductController;

import java.util.List;
import java.util.Map;

public interface OrderController extends CustomerController, ProductController{

    void createOrder(Customer customer, List<Product> productList);
    void readOrder();
    Map<Integer, Order> allOrders();

    // Create, Close, (Recount), Read (find(see) all products)
}
