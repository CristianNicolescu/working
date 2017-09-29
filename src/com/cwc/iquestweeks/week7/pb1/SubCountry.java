package com.cwc.iquestweeks.week7.pb1;


public class SubCountry extends Country{
    public SubCountry(String name, String capital) {
        super(name, capital);
    }

    /**
     * Compares based on capital
     * @param c
     * @return
     */
    @Override
    public int compareTo(Country c) {
        return capital.compareTo(c.capital);
    }
}
