package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = initializeList();
        printShortElementsOfList(list);
    }

    // выводим самые короткие строки в экран
    private static void printShortElementsOfList(ArrayList<String> list) {
        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
            }
        }
    }

    /**
     * Создаем список и добавляем из клавиатуры 5 строк
     * Сортируем список, самый первое значение у нас самое кароткое
     *
     * @return
     * @throws IOException
     */
    public static ArrayList<String> initializeList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String element = reader.readLine();
            list.add(element);
        }
        Collections.sort(list);
        return list;
    }
}
