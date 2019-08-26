package com.javarush.task.task10.task1012;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // Склеиваем все слова в одну строку
        String text = "";
        for (String string : list) {
            text += string;
        }

        // Все символы текста добавляем в лист символов
        ArrayList<Character> textChars = new ArrayList<>();
        for (char c : text.toCharArray()) {
            textChars.add(c);
        }

        // Выводим количество символов встречающихся в тексте
        for (Character character : alphabet) {
            System.out.println(character + " " + Collections.frequency(textChars, character));
        }
    }

}
