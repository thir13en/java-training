package com.santiloopz.learning.builtinlists.arrays.banking;

public class Main {
    public static void main (String args[]) {
        Bank bank = new Bank("Triodos Bank");

        bank.addBranch("Berlin");

        bank.addCustomer("Berlin", "Natalia", 7777.77);

        bank.addBranch("Barcelona");

        bank.addCustomer("Barcelona", "Tesla", 9999.99);

        bank.listCustomers("Barcelona", true);
        bank.listCustomers("Berlin", true);

        if (!bank.addCustomer("Melbourne", "Filipo", 222222.22)) {
            System.out.println("Error, Melbourne branch does not exist.");
        }

        if (!bank.addBranch("Barcelona")) {
            System.out.println("Error, Barcelona branch already exists.");
        }
    }
}
