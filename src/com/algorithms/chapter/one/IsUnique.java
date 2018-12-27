package com.algorithms.chapter.one;

import java.util.Arrays;

public class IsUnique {

/*
    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures?
*/

    public static void main(String[] args){

        execute("abcd");
        execute("abca");
        execute("abbd");
        execute("a");
    }

    public static void execute(String param){
        System.out.println("---------------------------");
        System.out.println("Input:  " + param);
        System.out.println("Output: " + solveOptimal(param));
        System.out.println("---------------------------");
    }

    public static boolean solveOptimal(String str){

        boolean[] occurrences = new boolean[256];

        char[] arr = str.toCharArray();

        for (char c: arr) {
            if(occurrences[c])
                return false;

            occurrences[c] = true;
        }
        return true;
    }

    public static boolean solve(String str){
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++)
            if(arr[i] == arr[i + 1])
                return false;

        return true;
    }
}
