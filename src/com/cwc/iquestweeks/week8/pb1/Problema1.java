package com.cwc.iquestweeks.week8.pb1;


import java.util.HashSet;
import java.util.Set;

public class Problema1 {
    public static void main(String args[])
    {
        MyCollection<Set> set= new MyCollectionImpl();
        set.addAll(new HashSet());
        System.out.println(set.containsAll(new HashSet()));
    }
}
