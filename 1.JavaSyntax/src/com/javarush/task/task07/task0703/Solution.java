package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        printNumbers(array);
    }

    public static int[] initializeArray() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        int[] numbers = new int[10];
        for (int i = 0; i < list.length; i++) {
            // в строкой массив заполняем строками с клавиатуры
            String word = reader.readLine();
            list[i] = word;

            // в каждую ячейку массива чисел будем записывать длину строки из массива строк
            int wordLength = word.length();
            numbers[i] = wordLength;
        }
        return numbers;
    }

    // выводим содержимое массива чисел на экран
    private static void printNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
