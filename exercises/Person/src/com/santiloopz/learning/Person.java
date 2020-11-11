package com.santiloopz.learning;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public boolean isTeen() {

        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        if ((this.firstName.isEmpty()) && (this.lastName.isEmpty())) {
            return "";
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }
}
