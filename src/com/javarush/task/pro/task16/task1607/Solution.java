package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();//напишите тут ваш код

        return today;
    }

    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);//напишите тут ваш код

        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = LocalDate.ofYearDay(2020,256);//напишите тут ваш код

        return date;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate date = LocalDate.ofEpochDay(18517);//напишите тут ваш код

        return date;
    }
}
