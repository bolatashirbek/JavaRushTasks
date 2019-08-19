package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Мырзабек", dateFormat.parse("JUNE 2 2012"));
        map.put("Жәнібек", dateFormat.parse("JULY 21 2012"));
        map.put("Ілияс", dateFormat.parse("MARCH 12 2012"));
        map.put("Әділбекұлы", dateFormat.parse("AUGUST 13 2012"));
        map.put("Қазбек", dateFormat.parse("SEPTEMBER 3 2012"));
        map.put("Талғатұлы", dateFormat.parse("OCTOBER 26 2012"));
        map.put("Жаппаров", dateFormat.parse("APRIL 11 2012"));
        map.put("Қанатбек", dateFormat.parse("NOVEMBER 23 2012"));
        map.put("Сапархан", dateFormat.parse("DECEMBER 20 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.values().removeIf(value -> (value.getMonth() >= Calendar.JUNE) && (value.getMonth() <= Calendar.AUGUST));
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
