package com.algorithms.chapter.one;

import java.util.Arrays;

public class URLify {

/*
    Write a method to replace all spaces in a string with '%20'. You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given the "true"
    length of the string. (Note: if implementing in Java, please use a character array so that you can
    perform this operation in place.)
*/


    public static void main(String[] args){
        execute("Mr John Smith    ", 13);
    }


    public static void execute(String param, int trueLength){
        System.out.println("---------------------------");
        System.out.println("Input:  " + param);
        System.out.println("Output: " + solve(param, trueLength));
        System.out.println("---------------------------");
    }

    public static String solve(String str1, int trueLength){

        char[] arr = str1.toCharArray();
        int tailIndex = str1.length() - 1;

        for(int i = trueLength - 1; i > 0; i--){
            if(arr[i] == ' '){
                arr[tailIndex] = '0';
                arr[tailIndex - 1] = '2';
                arr[tailIndex - 2] = '%';
                tailIndex -= 3;
            }
            else{
                arr[tailIndex] = arr[i];
                tailIndex--;
            }
        }

        return Arrays.toString(arr);
    }
}
