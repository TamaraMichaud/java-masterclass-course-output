package com.michaud.tamara.basics;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age > 100 || age < 0) ? 0 : age;
    }

    public boolean isTeen() {

        return (age > 12 && age < 20);
    }

    public String getFullName() {

        if (firstName.isEmpty()) {
            if (lastName.isEmpty()) {
                return "";
            } else {
                return lastName;
            }
        } else {
            if (lastName.isEmpty()) {
                return firstName;
            } else {

                return firstName + " " + lastName;
            }
        }

    }
}
