package com.company;

public class Cat {
    String name; // Имя кошки
    int age; // Возраст кошки

    Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void Info(){
        System.out.println("Имя кошки: " + this.name + ". Возраст кошки: " + this.age + ".");
    }
}