package com.cwc.iquestweeks.week3.pb1;


public class Problema1 {
    public static void main(String args[])
    {
        Person p1 = new Person("p1") {
            @Override
            public String getBirthDate() {
                return "yesterday";
            }

            @Override
            public String selfDescribe() {
                return "I was born "+getBirthDate()+", mate";
            }
        };
        Person p2 = new Person("p1") {
            @Override
            public String getBirthDate() {
                return "1921";
            }

            @Override
            public String selfDescribe() {
                return "Bonjour! "+getBirthDate();
            }
        };
        System.out.println(p1.selfDescribe());
        System.out.println(p2.selfDescribe());
    }
}
