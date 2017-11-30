package com.company;

public class Main {
    public  static  void main(String[] args) {

        Cat cat1 = new Cat("Мурка", 5);
        cat1.Info();
        Cat cat2 = new Cat("Пушинка", 7);
        cat2.Info();
        People people1 = new People("Василий", 23, cat1);
        people1.Info();
        People people2 = new People("Петр", 20, cat2);
        people2.Info();
    }
}
