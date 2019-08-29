package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(5);
        print(new Integer(6));
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void print(Integer num) {
        System.out.println(num);
    }
}
