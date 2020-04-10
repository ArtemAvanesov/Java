package com.company;
import cat_package.Cat;
import people_package.People;
import people_package.Sportsman;

public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {

        cat = new Cat(2, "Persian cat", "Garfield");
        people = new People("Alex","Ivanov",21,cat);
        people.getCat().setName("George");
        System.out.println(people);
        people.sayHello();

        Sportsman sportsman = new Sportsman("Bob", "Petrov", 19, null);
        sportsman.setTypeSport("Tennis");
        System.out.println(sportsman);
        sportsman.sayHello();

        }

    }