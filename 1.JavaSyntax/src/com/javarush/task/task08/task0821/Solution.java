package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> peoples = new HashMap<>();
        peoples.put("Nugman", "Sultan");
        peoples.put("Nurmagambetuly", "Temirbek");
        peoples.put("Sinicsin", "Eugene");
        peoples.put("Sabyrgalyuly", "Daniyar");
        peoples.put("Sultanbek", "Bekarys");
        peoples.put("Sapargaliev", "Taiyr");
        peoples.put("Tursynbekuly", "Anara");
        peoples.put("Maukenuly", "Beksultan");
        peoples.put("Sultanbek", "Daniyar");
        peoples.put("Anarbay", "Sultan");
        return peoples;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
