package com.di.exoxp.classes;

public class Person {

    private String name;
    private String lastName;
    private String email;
    private int age;

    public Person(String name, String lastName, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Person : {name = '" + this.getName() + "' , lastName = '" + this.getLastName() + "' , email = '"
                + this.getEmail() + "' , age = '" + this.getAge() + "'}";
    }
}
