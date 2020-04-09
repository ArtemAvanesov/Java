package com.company;

public class Main {

    static Cat cat = new Cat();
    static People people = new People();

    public static void main(String[] args) {

        cat.name = "George";
        cat.type = "Persian cat";
        cat.age = 2;


        people.name = "Alex";
        people.lastName = "Ivanov";
        people.age = 21;
        people.cat = cat;

        System.out.println(people);
        cat.say();
        people.cat.say();

    }
}
