package com.matiusha.homeworks.homework_02;

/*Practice 3
Introduction
The ﬁrst century spans from the year 1 up to and including the year 100,
The second - from the year 101 up to and including the year 200, etc.
Task :
Given a year, return the century it is in.
Input , Output Examples :
centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)*/

public class Century {
    public static void main(String[] args) {
        System.out.println(centuryFromYear(1705));
        System.out.println(centuryFromYear(1900));
        System.out.println(centuryFromYear(1601));
        System.out.println(centuryFromYear(2000));
    }

    private static int centuryFromYear(int year) {
        int century = 0;
        if (year >= 1 && year <= 100) {
            century = 1;
        }
        if (year >= 101 && year <= 200) {
            century = 2;
        }
        if (year >= 201 && year <= 300) {
            century = 3;
        }
        if (year >= 301 && year <= 400) {
            century = 4;
        }
        if (year >= 401 && year <= 500) {
            century = 5;
        }
        if (year >= 501 && year <= 600) {
            century = 6;
        }
        if (year >= 601 && year <= 700) {
            century = 7;
        }
        if (year >= 701 && year <= 800) {
            century = 8;
        }
        if (year >= 801 && year <= 900) {
            century = 9;
        }
        if (year >= 901 && year <= 1000) {
            century = 10;
        }
        if (year >= 1001 && year <= 1100) {
            century = 11;
        }
        if (year >= 1101 && year <= 1200) {
            century = 12;
        }
        if (year >= 1201 && year <= 1300) {
            century = 13;
        }
        if (year >= 1301 && year <= 1400) {
            century = 14;
        }
        if (year >= 1401 && year <= 1500) {
            century = 15;
        }
        if (year >= 1501 && year <= 1600) {
            century = 16;
        }
        if (year >= 1601 && year <= 1700) {
            century = 17;
        }
        if (year >= 1701 && year <= 1800) {
            century = 18;
        }
        if (year >= 1801 && year <= 1900) {
            century = 19;
        }
        if (year >= 1901 && year <= 2000) {
            century = 20;
        }
        if (year >= 2001 && year <= 2100) {
            century = 21;
        }
        return century;
    }
}
