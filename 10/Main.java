package com.company;
import cat_package.Cat;
import people_package.People;
import people_package.Sportsman;

public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {

        cat = new Cat(2, "Персидский", "Гарфилд");
        people = new People("Alex","Ivanov",21,cat);
        people.getCat().setName("Джордж");
        System.out.println(people);
        people.sayHello();

        Sportsman sportsman = new Sportsman("Боб", "Петров", 19, null);
        sportsman.setTypeSport("Тенис");
        System.out.println(sportsman);
        sportsman.sayHello();

        }

    }

