package com.company;

import java.util.Random;

public class Lesson2_3 {

    public static void main(String[] args) {

        //Generate a random int number in range 10 - 100
        //calculate the square of it. (Math.pow())
        //cast the result to String, (String.valueOf())
        //print the result

        Random random = new Random();

        int firstNumber = random.nextInt(90) + 10;
        int secondNumber = random.nextInt(90) + 10;

        // in this version in Math.pow sum cast to double and then cast to String
        // String resultToString = String.valueOf(Math.pow(firstNumber + secondNumber,2));

        int squareOfTwoNumbers = (int) Math.pow(firstNumber + secondNumber, 2);
    
        String resultToString = String.valueOf(squareOfTwoNumbers);

        System.out.println(resultToString);

    }
}
