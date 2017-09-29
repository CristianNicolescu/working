package com.cwc.iquestweeks.week1.pb1;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int deathYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }

    /**
     * Overrides toString method to display data in proper format (first name last name (dob-dod))
     *
     * @return String version of person
     */
    @Override
    public String toString() {
        if(deathYear!=0)
            return firstName + " " + lastName + "(" + birthYear + "-" + deathYear + ")";
        else
            return firstName + " " + lastName + "(" + birthYear + "-" + ")";
    }

    /**
     * Converts first name and last name into a unique ID
     *
     * @return String - unique ID of the Person
     */
    public String getUID() {
        return firstName + lastName;
    }
}
