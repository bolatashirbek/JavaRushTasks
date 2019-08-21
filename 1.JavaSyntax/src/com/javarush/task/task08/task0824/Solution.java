package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        // Два дедушки, две бабушки, отец, мать, трое детей
        Human son = new Human();
        son.name = "Beka";
        son.sex = true;
        son.age = 22;

        Human daughter1 = new Human();
        daughter1.name = "Banu";
        daughter1.sex = false;
        daughter1.age = 13;

        Human daughter2 = new Human();
        daughter2.name = "Aisok";
        daughter2.sex = false;
        daughter2.age = 10;

        ArrayList<Human> grandChilds = new ArrayList<>();
        grandChilds.add(son);
        grandChilds.add(daughter1);
        grandChilds.add(daughter2);

        Human father = new Human();
        father.name = "Bake";
        father.sex = true;
        father.age = 53;
        father.children = grandChilds;

        Human mother = new Human();
        mother.name = "Bakhyt";
        mother.sex = false;
        mother.age = 52;
        mother.children = grandChilds;

        ArrayList<Human> fGrandChild = new ArrayList<>();
        fGrandChild.add(father);

        ArrayList<Human> mGrandChild = new ArrayList<>();
        mGrandChild.add(mother);

        Human fGrandFather = new Human();
        fGrandFather.name = "Pazylbek";
        fGrandFather.sex = true;
        fGrandFather.age = 93;
        fGrandFather.children = fGrandChild;

        Human fGrandMother = new Human();
        fGrandMother.name = "Kulaim";
        fGrandMother.sex = false;
        fGrandMother.age = 89;
        fGrandMother.children = fGrandChild;

        Human mGrandFather = new Human();
        mGrandFather.name = "Zhuparbek";
        mGrandFather.sex = true;
        mGrandFather.age = 81;
        mGrandFather.children = mGrandChild;

        Human mGrandMother = new Human();
        mGrandMother.name = "Raia";
        mGrandMother.sex = false;
        mGrandMother.age = 79;
        mGrandMother.children = mGrandChild;

        System.out.println(fGrandFather);
        System.out.println(fGrandMother);
        System.out.println(mGrandFather);
        System.out.println(mGrandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter1);
        System.out.println(daughter2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (children != null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }
}
