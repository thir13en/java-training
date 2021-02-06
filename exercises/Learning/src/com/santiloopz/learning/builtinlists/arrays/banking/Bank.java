package com.santiloopz.learning.builtinlists.arrays.banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                System.out.println("Branch is already in the Bank");
                return false;
            }
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();
            for (Customer customer : customers) {
                if (customer.getName().equals(customerName)) {
                    return false;
                }
            }
            branch.newCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        ArrayList<Customer> customers = branch.getCustomers();

        System.out.println("Customer details for branch " + branch.getName());
        for (int i=0; i<customers.size(); i++) {
            Customer currentCustomer = customers.get(i);
            System.out.println("Customer: " + currentCustomer.getName() + "[" + (i+1) + "]");
            ArrayList<Double> transactions = currentCustomer.getTransactions();

            if (printTransactions) {
                System.out.println("Transactions");
                for (int j=0; j< transactions.size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }
}
