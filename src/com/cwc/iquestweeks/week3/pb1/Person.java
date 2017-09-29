package com.cwc.iquestweeks.week3.pb1;

import java.util.regex.Pattern;

public abstract class Person {
    private String firstName = "";
    private String surname;

    /**
     * Accepts a full name with words separated by space [surname firstname] and splits it
     *
     * @param fullName
     */
    public Person(String fullName) {
        String[] tmp = fullName.split(Pattern.quote(" "));
        surname = tmp[0];
        for (int i = 1; i < tmp.length; i++) {
            firstName += tmp[i] + " ";
        }
    }

    /**
     * Accepts first name and surname
     *
     * @param firstName
     * @param surname
     */
    public Person(String surname, String firstName) {
        this.firstName = firstName;
        this.surname = surname;
    }

    /**
     * Returns the birthdate of the person
     * @return
     */
    public abstract String getBirthDate();

    /**
     * Returns the self description of the person
     * @return
     */
    public abstract String selfDescribe();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
