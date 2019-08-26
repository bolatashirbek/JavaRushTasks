package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String interest;
        private String nationality;
        private Human mother;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, Human mother) {
            this.name = name;
            this.mother = mother;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, String interest) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.interest = interest;
        }

        public Human(String name, String interest, String nationality) {
            this.name = name;
            this.interest = interest;
            this.nationality = nationality;
        }

        public Human(int age, boolean sex, String nationality) {
            this.age = age;
            this.sex = sex;
            this.nationality = nationality;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, String interest) {
            this.age = age;
            this.interest = interest;
        }

        public Human(String name, boolean sex, Human mother) {
            this.name = name;
            this.sex = sex;
            this.mother = mother;
        }
    }
}
