package Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerControllerImpl implements CustomerController{

    private Map<Integer, Customer> customers = new HashMap<>();

    @Override
    public void registerCustomer(String name, String address) {

        Customer customer = new Customer(name, address, generateId());
        customers.put(generateId(), customer);
    }

    @Override
    public Map<Integer, Customer> allCustomers(){
        Map<Integer, Customer> allCustomers = customers;
        return allCustomers;
    }

    private int generateId(){
        int id = 0;
        if(customers.isEmpty()) {
            id = 0;
        }
        for(int i = 0; i < customers.size(); i++){
            id = customers.get(id).getId() + 1;
        }
        return id;
    }

//    private int idGenerator() {
//        int id = 0;
//        if (customers.isEmpty()){
//            return 0;
//        }
//        id = customers.get(id).getId() + 1;
//        return id;
//    }
}