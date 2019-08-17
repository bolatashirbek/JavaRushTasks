package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // Два дедушки, две бабушки, отец, мать, трое детей
        Human fGrandFather = new Human("Василий", true, 65);
        Human fGrandMother = new Human("Марина", false, 63);
        Human mGrandFather = new Human("Алексей", true, 68);
        Human mGrandMother = new Human("Светлана", false, 64);
        Human father = new Human("Андрей", true, 38, fGrandFather, fGrandMother);
        Human mother = new Human("Наталья", false, 37, mGrandFather, mGrandMother);
        Human son = new Human("Виталий", true, 12, father, mother);
        Human son2 = new Human("Александр", true, 8, father, mother);
        Human daughter = new Human("Екатерина", false, 3, father, mother);
        System.out.println(fGrandFather);
        System.out.println(fGrandMother);
        System.out.println(mGrandFather);
        System.out.println(mGrandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}