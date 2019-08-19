package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        integers.add(9);
        integers.add(10);
        integers.add(11);
        integers.add(12);
        integers.add(8);
        integers.add(1);
        integers.add(0);
        integers.add(14);
        integers.add(4);
        integers.add(15);
        integers.add(6);
        integers.add(16);
        integers.add(38);
        integers.add(20);
        integers.add(19);
        integers.add(23);
        return integers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
