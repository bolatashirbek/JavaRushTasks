package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Nugmanov", "Alikhan");
        map.put("Nurmagambetov", "Timur");
        map.put("Svalukhin", "Eugene");
        map.put("Sabyrgaly", "Islam");
        map.put("Kassymbekov", "Bekarys");
        map.put("Sabyrgaliev", "Taiyr");
        map.put("Tursynbek", "Anara");
        map.put("Maukenov", "Beksultan");
        map.put("Shulakov", "Daniyar");
        map.put("Anarbay", "Beksultan");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int fnCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                fnCount++;
            }
        }
        return fnCount;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int lnCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) lnCount++;
        }
        return lnCount;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int nameCount = getCountTheSameFirstName(map, "Beksultan");
        int lnCount = getCountTheSameLastName(map, "Sabyrgaliev");

        System.out.println("firstName count: " + nameCount);
        System.out.println("lastName count: " + lnCount);
    }
}
