package com.cwc.iquestweeks.week4.pb3;

public class Problema3 {
    public static void main(String args[]){
        SentenceGenerator sentenceGenerator = new SentenceGenerator();
        for(int i=0;i<20;i++)
            System.out.println(sentenceGenerator.buildSentence());
    }
}
