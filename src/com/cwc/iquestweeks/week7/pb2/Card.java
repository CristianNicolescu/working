package com.cwc.iquestweeks.week7.pb2;

public class Card {
    private char suite;
    private Integer number;

    public Card(char suite, int number) {
        this.suite = suite;
        this.number = number;
    }

    public char getSuite() {
        return suite;
    }

    public void setSuite(char suite) {
        this.suite = suite;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
