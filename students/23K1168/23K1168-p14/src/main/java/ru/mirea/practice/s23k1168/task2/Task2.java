package ru.mirea.practice.s23k1168.task2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Task2 {
    private Task2() {

    }

    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        String[] testStrings = {"abcdefghijklmnopqrstuv18340", "abcdefghijklmnoasdfasdpqrstuv18340", "abcdefghijklmnopqrstuv1834"};

        for (String test : testStrings) {
            Matcher matcher = Pattern.compile(regex).matcher(test);
            if (matcher.matches()) {
                System.out.println(test + " - совпадает");
            } else {
                System.out.println(test + " - не совпадает");
            }
        }
    }
}
