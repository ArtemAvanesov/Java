package com.company;


public class Cat {

    int age;
    String type;
    String name;

    void say()
    {
        System.out.println("Мяу!");
    }


    @Override
    public String toString() {
        return "Cat[Имя: " + name + ", Порода: " + type + ", Возраст: " + age + "]";
    }
}
