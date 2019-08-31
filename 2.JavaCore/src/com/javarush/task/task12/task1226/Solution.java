package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {
        @Override
        public void climb() {
            System.out.println("Кот лазить по деревьям");
        }

        @Override
        public void run() {
            System.out.println("Кот бегает");
        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {
            System.out.println("Собака бежит");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        @Override
        public void fly() {
            System.out.println("Утка летит");
        }

        @Override
        public void run() {
            System.out.println("Утка бегает");
        }
    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }
}
