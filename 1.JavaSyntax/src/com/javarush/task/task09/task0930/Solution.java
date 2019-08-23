package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            if (s == null) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    /**
     * Сортируем числа по убыванию,
     * слова сортируем по возрастанию(алфовитному) порядку
     *
     * @param array
     */
    public static void sort(String[] array) {
        // проходим массив с конца до 0 элемента
        for (int i = array.length - 1; i > 0; i--) {

            // проверяем переданное значение на число
            if (isNumber(array[i])) {
                //если число, проходим массив с 0 до i элемента
                for (int j = 0; j < i; j++) {
                    // проверяем элемент j на число
                    if (isNumber(array[j])) {
                        // если число, сравниваем элемент i c элементом j
                        int n = Integer.parseInt(array[i]);
                        int m = Integer.parseInt(array[j]);
                        // если последний элемент i больше j элемента, поменяем их местами
                        if (n > m) {
                            // в временную переменную tmp, присвоем элемент i
                            String tmp = array[i];
                            array[i] = array[j];
                            array[j] = tmp;
                        }
                    }
                }
            } else {
                // если строка, проходим массив с 0 до i элемента
                for (int s = 0; s < i; s++) {
                    // если элемент s строка
                    if (!isNumber(array[s])) {
                        // сравниваем строку s со строкой i
                        // если строка i больше строки s, поменяем их местами
                        if (isGreaterThan(array[s], array[i])) {
                            String tmp = array[i];
                            array[i] = array[s];
                            array[s] = tmp;
                        }
                    }
                }
            }
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
