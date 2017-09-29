package com.cwc.iquestweeks.week1.pb1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.List;

import static com.cwc.iquestweeks.week1.pb1.ReadFromFile.readLinesFromTextFile;

public class Problema1 {
    /**
     * Takes in a string compatible with the details of the person and converts it into a Person object
     *
     * @param input String
     * @return Person
     */
    public static Person parseToPersonDetails(String input) {
        String data[] = input.split(Pattern.quote(","));
        Person person = new Person();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                switch (i) {
                    case 0:
                        person.setFirstName(data[i].trim());
                        break;
                    case 1:
                        person.setLastName(data[i].trim());
                        break;
                    case 2:
                        person.setBirthYear(Integer.parseInt(data[i].trim()));
                        break;
                    case 3:
                        person.setDeathYear(Integer.parseInt(data[i].trim()));
                        break;
                }
            }
        }
        return person;
    }

    /**
     * Checks if a list of persons contains a person based on the unique ID of that person
     *
     * @param personList      The list of persons
     * @param personToCompare The person which is checked
     * @return true if it is contained, false otherwise
     */
    public static boolean checkIfDuplicatePersons(List<Person> personList, Person personToCompare) {
        for (Person p : personList) {
            if (p.getUID().equals(personToCompare.getUID())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Converts an array of strings into a list of persons
     *
     * @param data The string array of person data
     * @return List of persons
     */
    public static List<Person>generateArrayOfPersons(String[] data) {
        List<Person> personList = new ArrayList<>();
        for (String s : data) {
            Person newPerson = parseToPersonDetails(s);
            if (!checkIfDuplicatePersons(personList, newPerson)) {
                personList.add(newPerson);
            }
        }
        return personList;
    }

    /**
     * Prints person data to console
     * @param personList The list of persons
     */
    public static void printPersonData(List<Person> personList) {
        for(Person p:personList)
        {
            System.out.println(p.toString());
        }
    }

    public static void main(String args[]) {
        try {
            String[] fileData = readLinesFromTextFile("src\\com\\cwc\\iquestweeks\\week1\\pb1\\W1P1input.txt");
            List<Person> personList = generateArrayOfPersons(fileData);
            printPersonData(personList);
        }catch ( IOException e)
        {
            e.printStackTrace();
        }
    }
}
