package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bolat");
        list.add("Bagdaulet");
        list.add("Bekzat");
        list.add("Balnur");
        list.add("Aisana");
        System.out.println(list.size());
        for (String word : list) {
            System.out.println(word);
        }
    }
}
