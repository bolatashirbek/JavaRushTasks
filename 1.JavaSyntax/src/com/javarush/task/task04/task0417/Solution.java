package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        isPair(first, second, third);
    }

    private static void isPair(int first, int second, int third) {
        if (first == second && first == third)
            System.out.println(first + " " + second + " " + third);
        else if (first == second)
            System.out.println(first + " " + second);
        else if (first == third)
            System.out.println(first + " " + third);
        else if (second == third)
            System.out.println(second + " " + third);
    }
}