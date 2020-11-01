package com.company;

import java.util.Random;

public class Lesson2_9 {

    public static void main(String[] args) {

        //Write a Java program that accepts two integer values between 25 to 75
        //and return true if there is a common digit in both numbers
        //Input the first number: 35
        //Input the second number: 45
        //Result: true

        Random random = new Random();

        int firstNumber = random.nextInt(50) + 25;
        int secondNumber = random.nextInt(50) + 25;

        boolean answer = false;
        int firstLeftNumber = firstNumber / 10;
        int firstRightNumber = firstNumber % 10;
        int secondLeftNumber = secondNumber / 10;
        int secondRightNumber = secondNumber % 10;

        if (firstLeftNumber == secondLeftNumber || firstLeftNumber == secondRightNumber ||
                firstRightNumber == secondLeftNumber || firstRightNumber == secondRightNumber) {
            answer = true;
            System.out.println(answer);
        } else {
            System.out.println(answer);
        }

    }
}
