package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        List<String> keys = new LinkedList<>();

        //вводим с клавиатуры url адрес
        String stringUrl = reader.readLine();
        URL url = new URL(stringUrl.trim());
        //из урл выделяем параметры
        String query = url.getQuery();
        //выделяем пару параметров и добавляем в массив
        String[] pairParams = query.split("&");

        // проходим массив по циклу
        for (String pair : pairParams) {
            // и добавляем параметры в map по ключу и значению
            // проверяем содержит ли параметр значение, разделитель знак =
            if (pair.contains("=")) {
                int index = pair.indexOf("=");
                String key = pair.substring(0, index);
                String value = pair.substring(index + 1);
                keys.add(key);
                map.put(key, value);
            } else {
                keys.add(pair);
                //если значения нет добавляем null
                map.put(pair, null);
            }
        }

        // выводим название параметров по условий
        for (String key : keys) {
            System.out.print(key + " ");
        }
        System.out.println();

        // выводим значение параметра obj
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("obj")) {
                try {
                    alert(Double.parseDouble(entry.getValue()));
                } catch (Exception e) {
                    alert(entry.getValue());
                }
            }
        }

        reader.close();
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
