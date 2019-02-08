package Order;

import Customer.Customer;
import Product.Product;

import java.util.*;

public class Order {

    private int id;
    private Customer customer;
    private Map<Integer,Product> productList = new HashMap<>();
    private boolean orderState;

    public Order(int id, Customer customer, Map<Integer, Product> productList, boolean orderState) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        this.orderState = orderState;
    }

    public void changeState(boolean state){
        this.orderState = state;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Integer, Product> getProductList() {
        return productList;
    }

    public boolean isOrderState() {
        return orderState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                orderState == order.orderState &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(productList, order.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, productList, orderState);
    }

    @Override
    public String toString() {
        return "Order: " +
                "id = " + id +
                ", customer: " + customer +
                ", Product's List: " + productList +
                ", Order State equals " + orderState +
                '.';
    }
}