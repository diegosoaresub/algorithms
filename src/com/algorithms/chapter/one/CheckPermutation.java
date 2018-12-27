package com.algorithms.chapter.one;

public class CheckPermutation {

    public static void main(String[] args){

        execute("a", "ab");
        execute("a", "a");
        execute("abc", "bad");
        execute("ba", "ab");
        execute("dog ", "god ");

    }

    public static void execute(String param1, String param2){
        System.out.println("---------------------------");
        System.out.println("Input:  " + param1 + " - " +  param2);
        System.out.println("Output: " + solve(param1, param2));
        System.out.println("---------------------------");
    }


    public static boolean solve(String str1, String str2){

        if(str1.length() != str2.length())
            return false;

        int[] occurrences = new int[256];

        for(int i = 0; i < str1.length(); i++){
            occurrences[str1.charAt(i)]++;
            occurrences[str2.charAt(i)]--;
        }

        for(int occ : occurrences)
            if(occ != 0)
                return false;

        return true;
    }

}
