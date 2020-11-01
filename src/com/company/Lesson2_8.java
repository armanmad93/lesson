package com.company;

import java.util.Scanner;

public class Lesson2_8 {

    public static void main(String[] args) {

        //Given
        //you have a circle with radius 5:
        //Display a menu in console
        //------------MENU-----------
        //-- enter 1 for calculating area of the circle
        //-- enter 2 for calculating perimeter of the circle
        //-- enter 3 for exit.
        //in case user enters 1 calculate and print area of the circle
        //in case user enters 2 calculate and print perimeter of the circle
        //in case user enters 3 exit.

        int radius = 5;

        System.out.println("------------MENU-----------");
        System.out.println("-- enter 1 for calculating area of the circle");
        System.out.println("-- enter 2 for calculating perimeter of the circle");
        System.out.println("-- enter 3 for exit.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("plz input 1,2 or 3: ");
        int userNumber = scanner.nextInt();

        switch (userNumber) {
            case 1 -> System.out.println("area of the circle: " + (Math.PI * Math.pow(radius, 2)));
            case 2 -> System.out.println("perimeter of the circle: " + (2 * Math.PI * radius));
            case 3 -> System.out.println("EXIT!!");
            default -> System.out.println("ERROR!! plz inpiut 1,2 or 3");
        }

    }
}
