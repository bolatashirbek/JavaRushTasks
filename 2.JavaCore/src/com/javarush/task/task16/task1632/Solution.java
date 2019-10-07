package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThredThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {
        ThreadFour t = new ThreadFour();
        t.run();
    }

    public static class ThreadOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadTwo extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThredThree extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThreadFour extends Thread implements Message {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            //this.interrupt();
            threads.get(3).stop();
        }
    }

    public static class ThreadFive extends Thread {
        private String text;
        private volatile int result;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    text = reader.readLine();
                    if (text.equals("N")) {
                        System.out.println(result);
                        Thread.currentThread().interrupt();
                        break;
                    }
                    result += Integer.parseInt(text);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}