package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = initializeStrings();
        int maxLength = getMaxStringLength(strings);
        int minLength = getMinStringLength(strings);
        printResult(strings, maxLength, minLength);
    }

    // создаем список строк и добавляем 10 строк с клавиатуры
    private static ArrayList<String> initializeStrings() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        return strings;
    }

    // находим длину самой длинной строки
    private static int getMaxStringLength(ArrayList<String> strings) {
        int maxLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (maxLength < strings.get(i).length()) {
                maxLength = strings.get(i).length();
            }
        }
        return maxLength;
    }

    // находим длину самой короткой строки
    private static int getMinStringLength(ArrayList<String> strings) {
        int minLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (minLength > strings.get(i).length()) {
                minLength = strings.get(i).length();
            }
        }
        return minLength;
    }

    // выводим строку которая встретится раньше: короткую или длинную
    private static void printResult(ArrayList<String> strings, int maxLength, int minLength) {
        for (int i = 0; i < strings.size(); i++) {
            if ((strings.get(i).length() == minLength) || (strings.get(i).length() == maxLength)) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
