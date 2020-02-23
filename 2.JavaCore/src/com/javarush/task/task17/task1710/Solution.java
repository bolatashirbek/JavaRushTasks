package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat birthFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //Параметры запуска
        //args = "-c Миронов м 15/04/1990".split(" ");
        //args = "-u 1 Petrov м 01/01/1980".split(" ");
        //args = "-d 1".split(" ");
        //args = "-i 1".split(" ");
        switch (args[0]) {
            case "-c":
                createPerson(args);
                break;
            case "-u":
                updatePerson(args);
                break;
            case "-d":
                deletePerson(args);
                break;
            case "-i":
                personInfo(args);
                break;
        }
    }

    private static void personInfo(String[] args) {
        int index = Integer.parseInt(args[1]);
        Person person = allPeople.get(index);
        String name = person.getName();
        String sex = person.getSex() == Sex.MALE ? "м" : "ж";
        String birthday = birthFormat.format(person.getBirthDate());
        System.out.println(name + " " + sex + " " + birthday);
    }

    private static void createPerson(String[] args) throws ParseException {
        Person person = null;
        String name = args[1];
        Date birthdate = dateFormat.parse(args[3]);
        if (args[2].equals("м")) person = Person.createMale(name, birthdate);
        if (args[2].equals("ж")) person = Person.createFemale(name, birthdate);
        allPeople.add(person);
        System.out.println(allPeople.lastIndexOf(person));
    }

    private static void updatePerson(String[] args) throws ParseException {
        int index = Integer.parseInt(args[1]);
        String name = args[2];
        Sex sex = args[3].equals("м") ? Sex.MALE : Sex.FEMALE;
        Date birthDate = dateFormat.parse(args[4]);

        allPeople.get(index).setName(name);
        allPeople.get(index).setBirthDate(birthDate);
        allPeople.get(index).setSex(sex);
    }

    private static void deletePerson(String[] args) {
        int index = Integer.parseInt(args[1]);
        allPeople.get(index).setName(null);
        allPeople.get(index).setBirthDate(null);
        allPeople.get(index).setSex(null);
        System.out.println(allPeople);
    }

}
