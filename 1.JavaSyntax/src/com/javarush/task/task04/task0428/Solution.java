package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        positiveNumbersCount(firstNumber, secondNumber, thirdNumber);
    }

    private static void positiveNumbersCount(int firstNumber, int secondNumber, int thirdNumber) {
        int count = 0;
        if (firstNumber > 0) {
            count++;
        }
        if (secondNumber > 0) {
            count++;
        }
        if (thirdNumber > 0) {
            count++;
        }
        System.out.println(count);
    }
}
