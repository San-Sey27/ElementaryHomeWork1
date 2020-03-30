package com.matiusha.homeworks.homework_02;

/* Practice 4
You are given a function describeAge that takes a parameter age (which will always be a positive integer) and does the following:
If the age is 12 or lower, it return "You're a(n) kid"
If the age is anything between 13 and 17 (inclusive), it return "You're a(n) teenager"
If the age is anything between 18 and 64 (inclusive), it return "You're a(n) adult"
If the age is 65 or above, it return "You're a(n) elderly"
Your task is to shorten the code as much as possible */

public class DescriptionAge {
    public static void main(String[] args) {

        int age = 15;
        System.out.println(describeAge(age));
    }

    private static String describeAge(int age) {
        String tmp = "";
        if (age <= 12) {
            tmp = "You're a(n) kid";
        }
        if (age >= 13 && age <= 17) {
            tmp = "You're a(n) teenager";
        }
        if (age >= 18 && age <= 64) {
            tmp = "You're a(n) adult";
        }
        if (age >= 65) {
            tmp = "You're a(n) elderly";
        }
        return tmp;
    }
}
