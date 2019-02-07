package Customer;

public class Customer {

    private String customerName;
    private String address;
    private int id;

    public Customer(String customerName, String address, int id) {
        this.customerName = customerName;
        this.address = address;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (!customerName.equals(customer.customerName)) return false;
        return address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        int result = customerName.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer: ");
        sb.append("Customer name: ").append(customerName);
        sb.append(", address: ").append(address);
        sb.append(", id = ").append(id);
        sb.append('.');
        return sb.toString();
    }
}
