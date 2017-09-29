package com.cwc.iquestweeks.week2.pb1;

public class Problema1 {
    public static void main(String args[]) {
        Person p1 = new Person("n1 n n n");
        Person p2 = new Person("n1", "n n n");
        System.out.println(p1.getSurname()+" "+p1.getFirstName());
        System.out.println(p2.getSurname()+" "+p2.getFirstName());
    }
}
