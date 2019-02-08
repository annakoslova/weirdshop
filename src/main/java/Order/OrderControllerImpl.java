package Order;

import Customer.Customer;
import Product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderControllerImpl implements OrderController{

    private Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void createOrder(Customer customer, Map<Integer, Product> productList) {
        Order order = new Order(generateId(), customer, productList, true);
        orders.put(generateId(), order);
    }

    @Override
    public void readOrder(int id) {
        orders.get(id);
    }

    @Override
    public void closeOrder(int id) {
        Order order = orders.get(id);
        order.changeState(false);
    }

    @Override
    public Map<Integer, Order> allOrders() {
        Map<Integer, Order> allOrders = orders;
        return allOrders;
    }

    private int generateId(){
        int id = 0;
        if(orders.isEmpty()) {
            id = 0;
        }
        for(int i = 0; i < orders.size(); i++){
            id = orders.get(id).getId() + 1;
        }
        return id;
    }
}