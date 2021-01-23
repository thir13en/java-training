package com.santiloopz.learning.builtinlists.arrays.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public int findContact(String contactName) {
        for (int i=0; i<this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName() == contactName) {
                return i;
            }
        }
        return -1;
    }

    public int findContact(Contact contact) {
        return this.findContact(contact.getName());
    }

    public boolean addNewContact(Contact contact) {
        if (this.findContact(contact)) {
            return false;
        }
        this.myContacts.add(contact);
    }

    public boolean updateContact(Contact contact) {
        int existingContactPos = this.findContact(contact);

        if (existingContactPos == -1) {
            return false;
        }
        this.myContacts.get(existingContactPos).update(contact);

        return true;
    }

    public boolean removeContact(Contact contact) {
        int existingContactPos = this.findContact(contact);

        if (existingContactPos == -1) {
            return false;
        }
        this.myContacts.remove(existingContactPos);

        return true;
    }

    public Contact queryContact(String contactName) {
        int existingContactPos = this.findContact(contactName);

        if (existingContactPos == -1) {
            return null;
        }

        return this.myContacts.get(existingContactPos);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i=1; i<=this.myContacts.size(); i++) {
            Contact current = this.myContacts.get(i).getName();
            System.out.println(i + ". " + current.getName() + " -> " + current.getPhone());
        }
    }

}
