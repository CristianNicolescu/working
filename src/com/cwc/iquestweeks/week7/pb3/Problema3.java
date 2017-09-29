package com.cwc.iquestweeks.week7.pb3;

import java.util.HashSet;
import java.util.Set;

public class Problema3 {
    public static void main(String args[])
    {
        Set<Train> trains = new HashSet<>();
        Train t1=new Train(1,"chu chu", 2);
        Train t2=new Train(2, "chu chu chu", 3);
        Train t3=new Train(3,"chu", 1);
        Train t4=new Train(1,"chu chu", 2);
        trains.add(t1);
        trains.add(t2);
        trains.add(t3);
        trains.add(t4);//this is not added again
        trains.add(t1);//this is not added again

        for(Train t: trains)
        {
            t.print();
        }
    }
}
