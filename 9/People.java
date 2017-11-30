package com.company;

public class People {
    String  name;
    String lastName;
    int age;

    Cat cat;

    @Override
    public String toString() {
        return "People[Имя: " + name + ", Фамилия: " + lastName + ", Возраст: " + age + ". Есть кот: " + cat + "]";
    }
}
