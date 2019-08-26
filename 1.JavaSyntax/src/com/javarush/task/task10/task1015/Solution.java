package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayLists = new ArrayList[2];

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Bake");
        nameList.add("Baha");
        nameList.add("Beka");

        ArrayList<String> proffessions = new ArrayList<>();
        proffessions.add("Software developer");
        proffessions.add("Metallurgist");
        proffessions.add("Train driver");

        arrayLists[0] = nameList;
        arrayLists[1] = proffessions;
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}