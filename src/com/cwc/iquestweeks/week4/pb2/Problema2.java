package com.cwc.iquestweeks.week4.pb2;


public class Problema2 {
    public static void main(String args[])
    {
        Titlelizer t = new TitlelizerImpl();
        System.out.println(t.titlelize("a "));
        System.out.println(t.titlelize("the "));
        System.out.println(t.titlelize("to "));
        System.out.println(t.titlelize("in "));
        System.out.println(t.titlelize("of "));
        System.out.println(t.titlelize("hello from the mystical land of romania the"));
    }
}
