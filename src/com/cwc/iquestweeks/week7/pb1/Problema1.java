package com.cwc.iquestweeks.week7.pb1;

import java.util.ArrayList;
import java.util.Comparator;

public class Problema1 {
    public static void main(String args[]) {
        Country c1 = new Country("a","e");
        Country c2 = new Country("d", "b");
        Country c3 = new Country("b", "c");
        SubCountry c4 = new SubCountry("a","e");
        SubCountry c5 = new SubCountry("d", "b");
        SubCountry c6 = new SubCountry("b", "c");
        ArrayList<Country> arrayList1 = new ArrayList<>();
        arrayList1.add(c1);
        arrayList1.add(c2);
        arrayList1.add(c3);
        ArrayList<SubCountry> arrayList2 = new ArrayList<>();
        arrayList2.add(c4);
        arrayList2.add(c5);
        arrayList2.add(c6);
        for( Country c: arrayList1)
        {
            c.print();
        }
        System.out.println();
        arrayList1.sort(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.compareTo(o2);
            }
        });
        for( Country c: arrayList1)
        {
            c.print();
        }
        System.out.println();
        for( SubCountry c: arrayList2)
        {
            c.print();
        }
        System.out.println();
        arrayList2.sort(new Comparator<SubCountry>() {
            @Override
            public int compare(SubCountry o1, SubCountry o2) {
                return o1.compareTo(o2);
            }
        });
        for( Country c: arrayList2)
        {
            c.print();
        }
        System.out.println();
    }
}
