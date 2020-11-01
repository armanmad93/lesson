package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson2_5 {

    public static void main(String[] args) {

        //Generate 2 random ints
        //Take from console an operator (+, -, * or /)
        //perform calculation based on operator
        //(USING SWITCH)
        //print the result

        Random random = new Random();

        int firstNumber = random.nextInt();
        int secondNumber = random.nextInt();

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input operator (+, -, * or /): ");
        String calculatorOperator = scanner.nextLine();

        switch (calculatorOperator) {
            case "+" -> System.out.println("sum random numbers is: " + (firstNumber + secondNumber));
            case "-" -> System.out.println("minus random numbers is: " + (firstNumber - secondNumber));
            case "*" -> System.out.println("multiplication random numbers is: " + (firstNumber * secondNumber));
            case "/" -> System.out.println("dividev random numbers is: " + (firstNumber / secondNumber));
            default -> System.out.println("ERROR: plz input operator (+, -, * or /): ");
        }

    }
}
