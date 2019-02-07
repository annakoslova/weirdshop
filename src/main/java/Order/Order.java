package Order;

import Customer.Customer;
import Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private int id;
    private Customer customer;
    private List<Product> productList = new ArrayList<>();
    private boolean orderState;

    public Order(int id, Customer customer, List<Product> productList, boolean orderState) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        this.orderState = orderState;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProductList() {
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