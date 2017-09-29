package com.cwc.iquestweeks.week7.pb4;

import com.cwc.iquestweeks.week7.pb3.Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problema4 {
    private static HashMap<Train,List<Integer>> trainMap;
    private static Integer crtTrain=0;
    public static void main(String args[])
    {
        trainMap=new HashMap<>();
        for(int i=0;i<10000;i++)
        {
            addNewRecord();
        }
        for(Train t:trainMap.keySet())
        {
            if(Math.random()<0.01)
            {
                for(Integer i:trainMap.get(t))
                {
                    System.out.print("Day:"+i+" Train: ");
                    t.print();
                }
            }
        }
    }
    private static void addNewRecord()
    {
        Train t=new Train(crtTrain++,""+((char)(Math.round(Math.random()*128+1))),crtTrain%10+1);
        trainMap.put(t,generateDayList());
    }
    private static List<Integer> generateDayList()
    {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=365;i++)
            if(Math.random()<0.1)
                list.add(i);
        return list;
    }
}
