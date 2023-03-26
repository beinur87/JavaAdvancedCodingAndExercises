package ro.sda.advanced._4_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
    private String bankName;

    private List<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public List<Branch> getBranches() {
        return Collections.unmodifiableList(branches);
    }

    public Branch findBranch(String branchName) {
        for (Branch b : branches) {
            if (b.getBranchName().equals(branchName)) {
                return b;
            }
        }
        return null;
    }


    public void addBranch(String branchName) {
        Branch b = findBranch(branchName);
        if (b == null) {
            branches.add(new Branch(branchName));
        } else {
            System.out.println("Branch already exists!");
        }
    }

    public void addCustomer(String branchName, String customerName, double amount) {
        Branch b = findBranch(branchName);
        if (b != null) {
            try {
                b.addCustomer(customerName, amount);
            } catch (RuntimeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        } else {
            System.out.println("Branch doesn't exist!");
        }
    }

    public void addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch b = findBranch(branchName);
        if (b != null) {
            try {
                b.addCustomerTransaction(customerName, amount);
            } catch (RuntimeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

    public void listAllCustomers(String branchName, boolean showTransactions) {
        Branch b = findBranch(branchName);
        if (b != null) {
            System.out.println("Customer details for branch " + b.getBranchName());

            List<Customer> list = b.getCustomers();
            for (int i = 0; i < list.size(); i++) {
                Customer c = list.get(i);
                System.out.println("Customer: " + c.getName() + " [" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions: ");
                    List<Double> t = c.getTransactions();
                    for (int j = 0; j < t.size(); j++) {
                        System.out.println("[" + (j + 1) + "] amount: " + t.get(j));
                    }
                }
            }
        }
    }

}
