package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        positiveOrNegativeNumbersCount(firstNumber, secondNumber, thirdNumber);
        reader.close();
    }

    private static void positiveOrNegativeNumbersCount(int firstNumber, int secondNumber, int thirdNumber) {
        int positiveCount = 0;
        int negativeCount = 0;

        if (firstNumber > 0) {
            positiveCount++;
        } else if (firstNumber < 0) {
            negativeCount++;
        }

        if (secondNumber > 0) {
            positiveCount++;
        } else if (secondNumber < 0) {
            negativeCount++;
        }

        if (thirdNumber > 0) {
            positiveCount++;
        } else if (thirdNumber < 0) {
            negativeCount++;
        }
        System.out.println("количество отрицательных чисел: " + negativeCount);
        System.out.println("количество положительных чисел: " + positiveCount);
    }

    // 2-вариант: хорошее короткое решение
    private static void positiveOrNegativeNumbersCount2() throws IOException {
        int positiveCount = 0, negativeCount = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number > 0) positiveCount++;
            if (number < 0) negativeCount++;
        }
        reader.close();
        System.out.println("количество отрицательных чисел: " + negativeCount);
        System.out.println("количество положительных чисел: " + positiveCount);
    }
}
