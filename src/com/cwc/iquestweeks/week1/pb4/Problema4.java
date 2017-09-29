package com.cwc.iquestweeks.week1.pb4;

public class Problema4 {
    public static void main(String args[])
    {
        ConnectionManager connectionManager= new ConnectionManager();
        for(int i=0;i<26;i++)
        {
            System.out.println(connectionManager.getFreeConnection());
        }
    }
}
