package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        minimumOfTwoNumbers(first, second);
    }

    private static void minimumOfTwoNumbers(int first, int second) {
        if (first > second)
            System.out.println(second);
        else if (first == second)
            System.out.println(first);
        else
            System.out.println(first);
    }
}