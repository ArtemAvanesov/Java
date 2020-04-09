package com.company;

public class People {
    String  name;
    String lastName;
    int age;

    Cat cat;

    @Override
    public String toString() {
        return "People[First name: " + name + ", Last name: " + lastName + ", Age: " + age + ". Cat is: " + cat + "]";
    }
}
