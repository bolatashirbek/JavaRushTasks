package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Nugman", "Alibek");
        map.put("Nurmagambetuly", "Temirbek");
        map.put("Sinicsin", "Eugene");
        map.put("Sabyrgalyuly", "Erik");
        map.put("Kassymhan", "Bekarys");
        map.put("Sapargaliev", "Taiyr");
        map.put("Tursynbekuly", "Anara");
        map.put("Maukenuly", "Beksultan");
        map.put("Sultanbek", "Daniyar");
        map.put("Anarbay", "Beksultan");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copyMap = new HashMap<>(map);
        for (Map.Entry<String, String> cPair : copyMap.entrySet()) {
            int count = 0;
            String name = cPair.getValue();

            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (name.equals(pair.getValue())) count++;
            }

            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
