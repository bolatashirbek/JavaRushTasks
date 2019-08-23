package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] characters = text.trim().toCharArray();
        String vowelText = "";
        String otherText = "";
        for (int i = 0; i < characters.length; i++) {
            if (isVowel(characters[i])) {
                vowelText += characters[i] + " ";
            } else if (characters[i] != ' ') {
                otherText += characters[i] + " ";
            }
        }
        System.out.println(vowelText);
        System.out.println(otherText);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}