package com.cwc.iquestweeks.week1.pb2;

import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    private static List<Integer> primeList;

    /**
     * Checks to see if a number is prime by using a prime list
     *
     * @param nrToCheck The number to check if is prime
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int nrToCheck) {
        if (nrToCheck == 1)
            return false;
        for (int i = 0; i < primeList.size(); i++) {
            if (primeList.get(i) > nrToCheck / 2)
                return true;
            if (nrToCheck % primeList.get(i) == 0)
                return false;
        }
        return true;
    }

    /**
     * Prints the numbers from 1 to n and prints -PRIME where there's a prime number
     *
     * @param n Number to which to print
     */
    public static void printNumbers(int n) {
        primeList = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            System.out.print(i);
            if (isPrime(i)) {
                primeList.add(i);
                System.out.print("-PRIME");
            }
            if (i != n)
                System.out.print(", ");
        }
    }

    public static void main(String args[]) {
        //printNumbers(Integer.parseInt(args[0]));
        printNumbers(100);
    }
}
