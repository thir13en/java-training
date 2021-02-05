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

    public boolean addCustomer(String customerName, String branchName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if (customer == null) {
                addCustomer(customerName, branchName, initialTransaction);
                return true;
            }
        }
        return false;
    }

    public Branch findBranch(String branchName) {
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
}
