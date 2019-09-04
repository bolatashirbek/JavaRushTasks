package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen bhen = HenFactory.getHen(Country.BELARUS);
        System.out.println(bhen.getDescription());
        Hen rhen = HenFactory.getHen(Country.RUSSIA);
        System.out.println(rhen.getDescription());
        Hen uhen = HenFactory.getHen(Country.UKRAINE);
        System.out.println(uhen.getDescription());
        Hen mhen = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(mhen.getDescription());
    }

    static class HenFactory {
        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.BELARUS))
                hen = new BelarusianHen();
            else if (country.equals(Country.RUSSIA))
                hen = new RussianHen();
            else if (country.equals(Country.MOLDOVA))
                hen = new MoldovanHen();
            else if (country.equals(Country.UKRAINE))
                hen = new UkrainianHen();
            return hen;
        }
    }
}
