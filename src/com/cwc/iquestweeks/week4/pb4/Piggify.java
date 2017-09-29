package com.cwc.iquestweeks.week4.pb4;

import java.util.StringTokenizer;

public class Piggify {
    /**
     * Converts an English word into a pig latin word
     * @param input
     * @return String - the converted word
     */
    public static String pigLatinWord(String input)
    {
        return input.substring(1)+input.substring(0,1)+"ay";
    }

    /**
     * Converts a phrase into pig latin
     * @param input
     * @return String - the converted phrase
     */
    public static String pigLatinPhrase(String input)
    {
        StringTokenizer stringTokenizer=new StringTokenizer(input);
        StringBuilder output = new StringBuilder();
        while(stringTokenizer.hasMoreTokens())
        {
            output.append(pigLatinWord(stringTokenizer.nextToken())+" ");
        }
        return output.toString();
    }

    /**
     * Prints a pig latin word after conversion
     * @param input
     */
    public static void printLatinWord(String input)
    {
        System.out.println(pigLatinWord(input));
    }
}
