package com.company;

import java.util.Scanner;

public class Lesson2_7 {

    public static void main(String[] args) {

        //Write Program to print number of days in month using switch
        //Input “monthName” from console (you can get string from console by scanner.nextLine() )

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input month: ");
        String monthName = scanner.nextLine();

        switch (monthName) {
            case "January" -> System.out.println("January have 31 day.");
            case "February" -> System.out.println("February have 28/29 day.");
            case "March" -> System.out.println("March have 31 day.");
            case "April" -> System.out.println("April have 30 day.");
            case "May" -> System.out.println("May have 31 day.");
            case "June" -> System.out.println("June have 30 day.");
            case "July" -> System.out.println("July have 31 day.");
            case "August" -> System.out.println("August have 31 day.");
            case "September" -> System.out.println("September have 30 day.");
            case "October" -> System.out.println("October have 31 day.");
            case "November" -> System.out.println("November have 30 day.");
            case "December" -> System.out.println("December have 31 day.");
            default -> System.out.println("ERROR!! plz try again.");
        }

    }
}
