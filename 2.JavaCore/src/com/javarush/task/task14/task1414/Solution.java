package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Movie movie = null;
        String key = null;

        while (true) {
            key = reader.readLine();
            if ("soapOpera".equals(key)) {
                movie = MovieFactory.getMovie(key);
            } else if ("cartoon".equals(key)) {
                movie = MovieFactory.getMovie(key);
            } else if ("thriller".equals(key)) {
                movie = MovieFactory.getMovie(key);
            } else {
                movie = MovieFactory.getMovie(key);
                break;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
        reader.close();
    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
