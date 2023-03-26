package ro.sda.advanced._4_arraylist;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch {

    private List<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    public String getBranchName() {
        return branchName;
    }
    // method contains iterates over the list and searches for the desired element by comparing them using EQUALS method
    public void addCustomer(String customerName, double initialAmount) {
        Customer c = new Customer(customerName, initialAmount);
        if (customers.contains(c)) {
            throw new RuntimeException("Client already exists!");
        }
        customers.add(c);
    }

    public void addCustomerTransaction(String customerName, double amount) {
        for(Customer c : customers){
            if (c.getName().equals(customerName)) {
                c.addTransaction(amount);
                return;
            }
        }
        throw new RuntimeException("Customer doesn't exist!");
    }

}
