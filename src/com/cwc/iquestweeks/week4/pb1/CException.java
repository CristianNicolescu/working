package com.cwc.iquestweeks.week4.pb1;


public class CException extends RuntimeException{
    public static final String NULL_VALUE_EXCEPTION="Value is null";
    public static final String NOT_A_NUMBER="Value is not a number representation";
    public static final String OUT_OF_BOUNDS="The index entered was out of bounds";
    public CException(String message){
        super(message);
    }
}
