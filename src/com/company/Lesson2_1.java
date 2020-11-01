package com.company;

import java.util.Random;

public class Lesson2_1 {
    public static void main(String[] args) {

        //Generate 2 random int numbers in range 10 - 100
        //calculate the sum.
        //cast it to long.
        //print

        Random random = new Random();

        long firstNumber = random.nextInt(90) + 10;
        long secondNumber = random.nextInt(90) + 10;

        System.out.println("the sum of two Random numbers is: " + (firstNumber + secondNumber));

    }
}

