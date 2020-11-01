package com.company;

import java.util.Random;

public class Lesson2_2 {
    public static void main(String[] args) {

        //Generate 2 random int numbers in range 10 - 100
        //calculate the product.
        //in case product is even cast it to long
        //in case product is odd cast it to double
        //Print the product

        Random random = new Random();

        int firstNumber = random.nextInt(90) + 10;
        int secondNumber = random.nextInt(90) + 10;

        if ((firstNumber + secondNumber) % 2 == 0) {
            long sum = firstNumber + secondNumber;
            System.out.println("the sum of two random numbers cast to long: " + sum);
        } else {
            double sum = firstNumber + secondNumber;
            System.out.println("the sum of two random numbers cast to double: " + sum);
        }
    }
}
