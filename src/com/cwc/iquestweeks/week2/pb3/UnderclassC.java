package com.cwc.iquestweeks.week2.pb3;


public class UnderclassC extends SuperclassC{
    static
    {
        System.out.println("static block initialized");
    }
    Object o;
    public UnderclassC()
    {
        super();
        System.out.println("class initialized");
        LocalVariableV lv=new LocalVariableV();
        o=new Object();
        System.out.println("field initialized");
    }
}
