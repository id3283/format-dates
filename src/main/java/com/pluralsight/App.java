package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter merica = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(merica));


        System.out.println(now.getDayOfWeek() + ", " + now.getMonth() + ", " + now.getDayOfMonth() + " " + now.getYear());
    }
}
