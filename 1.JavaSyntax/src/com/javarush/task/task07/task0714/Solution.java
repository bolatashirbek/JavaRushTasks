package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        // вводим с клавиатуры 5 слов в список строк
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        // удаляем 3 элемент
        strings.remove(2);

        // выводим оставшиеся элементы в обратном порядке
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}
