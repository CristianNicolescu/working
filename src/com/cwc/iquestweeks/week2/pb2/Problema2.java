package com.cwc.iquestweeks.week2.pb2;

public class Problema2 {
    public static void main(String args[])
    {
        Tank t=new Tank();
        t.add(new Object());
        t.add(new Object());
        t.remove();
        t.remove();
        t.remove();
        if(t.finalizeF())
            System.gc();
    }
}
