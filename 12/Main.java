package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        boolean empty =  list.isEmpty();
        System.out.println(empty);


    }
}


