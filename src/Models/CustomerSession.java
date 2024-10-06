package Models;

public class CustomerSession {
    private Customer customer;
    private CustomerSessionStatus customerSessionStatus;

    public CustomerSessionStatus getCustomerSessionStatus() {
        return customerSessionStatus;
    }

    public void setCustomerSessionStatus(CustomerSessionStatus customerSessionStatus) {
        this.customerSessionStatus = customerSessionStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
