package Order;

import Customer.Customer;
import Product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderControllerImpl implements OrderController{

    private Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void createOrder(Customer customer, List<Product> productList) {
        Order order = new Order(generateId(), customer, productList, true);
    }

    @Override
    public void readOrder() {

    }

    @Override
    public Map<Integer, Order> allOrders() {
        return null;
    }

    @Override
    public void registerCustomer(String name, String address) {

    }

    @Override
    public Map<Integer, Customer> allCustomers() {
        return null;
    }

    @Override
    public void createProduct(String name, double price, double weight, boolean legal) {

    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public void updateProduct(int id, String name, double price, double weight, boolean legal) {

    }

    @Override
    public void readProduct(int id) {

    }

    @Override
    public Map<Integer, Product> getProductList() {
        return null;
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

//    private boolean findOrderState(){
//
//    }
}