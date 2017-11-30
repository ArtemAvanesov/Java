package com.company;

public class People {
    String name; // Имя человека
    int age; // Возраст человека
    Cat cat; // Кошка

    People (String name, int age, Cat cat){
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public void Info(){
        System.out.println("Имя человека: " + this.name + ". Возраст человека: " + this.age + ". " + "Кошка: " + this.cat.name);
    }
}
