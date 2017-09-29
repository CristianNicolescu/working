package com.cwc.iquestweeks.week7.pb1;

public class Country implements Comparable<Country>{
    protected String name;
    protected String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    /**
     * Compares based on the name of the country
     * @param c
     * @return
     */
    @Override
    public int compareTo(Country c) {
        return name.compareTo(c.name);
    }

    /**
     * Prints the data to console
     */
    protected void print()
    {
        System.out.println(name+" "+capital);
    }
}
