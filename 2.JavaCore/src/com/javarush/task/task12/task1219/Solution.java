package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {

        @Override
        public void run() {
            System.out.println("Человек бегает");
        }

        @Override
        public void swim() {
            System.out.println("Человек плавает");
        }
    }

    public class Duck implements CanFly, CanSwim, CanRun {

        @Override
        public void fly() {
            System.out.println("Утка летить");
        }

        @Override
        public void run() {
            System.out.println("Утка бежить");
        }

        @Override
        public void swim() {
            System.out.println("Утка плывет");
        }
    }

    public class Penguin implements CanSwim, CanRun {

        @Override
        public void run() {
            System.out.println("Пингвин бежить");
        }

        @Override
        public void swim() {
            System.out.println("Пингвин плавает");
        }
    }

    public class Airplane implements CanFly, CanRun {

        @Override
        public void fly() {
            System.out.println("Самолет летит");
        }

        @Override
        public void run() {
            System.out.println("Самолет передвигается");
        }
    }
}
