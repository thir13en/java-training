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
        for (int i=0; i<branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                System.out.println("Branch is already in the Bank");
                return false;
            }
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String name, String branch, double initialTransaction) {
        return false;
    }
}
