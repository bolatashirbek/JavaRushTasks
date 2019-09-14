package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String text = reader.readLine();
            if (text.equals("exit")) break;
            if (isNumeric(text)) {
                if (text.contains(".")) {
                    print(Double.parseDouble(text));
                } else if (isShortNumber(text)) {
                    print(Short.parseShort(text));
                } else if (isIntegerNumber(text)) {
                    print(Integer.parseInt(text));
                }
            } else {
                print(text);
            }
        }

        reader.close();
    }

    public static boolean isIntegerNumber(String text) {
        try {
            Integer num = Integer.parseInt(text);
            if (num <= 0 || num >= 128) return true;
            else return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isShortNumber(String text) {
        try {
            short num = Short.parseShort(text);
            if (num > 0 && num < 128)
                return true;
            else return false;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }

    public static boolean isNumeric(String text) {
        return text.matches("-?\\d+(\\.\\d+)?");
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
