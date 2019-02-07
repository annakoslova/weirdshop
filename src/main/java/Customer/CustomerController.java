package Customer;

import java.util.Map;

public interface CustomerController {

    void registerCustomer(String name, String address);
    Map<Integer, Customer> allCustomers();

    // Register
}
