package com.company;


public class Main {

    public static void main(String[] args) {
        List ml = new List();
        ml.addBack(1);
        ml.addBack(2);
        ml.addBack(1);
        ml.addFront(5);

        ml.printList();
        System.out.println();

        ml.delEl(3);
        ml.delEl(7);
        ml.delEl(1);
        ml.delEl(22);

        ml.printList();
        System.out.println();
    }
}
class List {
    private ListEl head;
    private ListEl tail;

    void addFront(int data)
    {
        ListEl a = new ListEl();
        a.data = data;

        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    void addBack(int data) {
        ListEl a = new ListEl();
        a.data = data;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void printList()
    {
        ListEl t = head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    void delEl(int data)
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        ListEl t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if(tail == t.next)
                {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}
class ListEl {
    ListEl next;
    int data;
}