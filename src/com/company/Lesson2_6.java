package com.company;

import java.util.Scanner;

public class Lesson2_6 {

    public static void main(String[] args) {

        //Write a program to input week number(1-7) from console and print day of week name
        //(1 - monday …7 - sunday) using switch case.

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input week number: ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1 -> System.out.println("number 1 is: Monday.");
            case 2 -> System.out.println("number two is Tuesday.");
            case 3 -> System.out.println("number tree is Wednesday.");
            case 4 -> System.out.println("number four is Thursday");
            case 5 -> System.out.println("number five is Friday.");
            case 6 -> System.out.println("number six is Saturday.");
            case 7 -> System.out.println("number seven is Sunday.");
            default -> System.out.println("ERROR! plz use input in range 1 - 7 ");
        }

    }
}
