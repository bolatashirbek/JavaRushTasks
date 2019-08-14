package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        initializeStrings();
        int maxLength = getMaxLength();
        printLongStrings(maxLength);
    }

    /**
     * 1. создаем список строк
     * 2. считаем с клавиатуры 5 строк и добавляем в список
     *
     * @throws IOException
     */
    private static void initializeStrings() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            strings.add(string);
        }
    }

    /**
     * используя цикл, находим самую длинную строку в списке
     *
     * @return
     */
    private static int getMaxLength() {
        int maxLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (maxLength <= strings.get(i).length()) {
                maxLength = strings.get(i).length();
            }
        }
        return maxLength;
    }

    /**
     * 1. выводим найденную строку на экран;
     * 2. если таких строк несколько, выводим каждую с новой строки
     *
     * @param maxLength
     */
    private static void printLongStrings(int maxLength) {
        for (int i = 0; i < strings.size(); i++) {
            if (maxLength == strings.get(i).length()) {
                String longString = strings.get(i);
                System.out.println(longString);
            }
        }
    }
}
