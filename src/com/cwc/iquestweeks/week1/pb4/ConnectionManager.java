package com.cwc.iquestweeks.week1.pb4;

public class ConnectionManager {
    private Connection[] connections;
    private int [] connectionUsed;

    /**
     * Simulates a connection generation of up to 25 connections
     */
    public ConnectionManager()
    {
        int maxConnections=(int)Math.round(Math.random()*25);
        connections=new Connection[maxConnections];
        connectionUsed=new int[maxConnections];
        for(int i=0;i<maxConnections;i++)
        {
            connections[i]=new Connection();
            connectionUsed[i]=0;
        }
    }

    /**
     * Tries to return the first unused connection
     * If it fails, returns null
     * @return Connection or null
     */
    public Connection getFreeConnection()
    {
        for(int k=0;k<connectionUsed.length;k++)
        {
            if(connectionUsed[k]==0) {
                connectionUsed[k]=1;
                return connections[k];
            }
        }
        return null;
    }
}
