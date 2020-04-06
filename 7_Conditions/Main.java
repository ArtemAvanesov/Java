package com.company;

public class Main {
    static boolean bool = false;
    static  int a = 5;

    public static void main(String[] args) {


        if (a==3)
            System.out.println("a=3");
        else if (a<3)
            System.out.println("a<3");
        else if (a>3)
            System.out.println("a>3");

        switch (a)
        {
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 1:
                System.out.println("1");
                break;
        }

    }
}
