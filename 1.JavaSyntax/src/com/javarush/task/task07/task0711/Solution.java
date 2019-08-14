package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = initializeList();
        removeAddLastElement(list);
        printResult(list);
    }

    // выводим содержимое результирующего списка на экран
    private static void printResult(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // выполняем 13 раз: удалить последнюю строку и вставить её в начало
    private static void removeAddLastElement(ArrayList<String> list) {
        for (int i = 0; i < 13; i++) {
            String text = list.get(4);
            list.remove(4);
            list.add(0, text);
        }
    }

    // создаем список строк и добавляем 5 строк с клавиатуры
    private static ArrayList<String> initializeList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String word = reader.readLine();
            list.add(word);
        }
        return list;
    }
}
