package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson2_4 {

    public static void main(String[] args) {

        //Get from the user an int number (from console)
        //in case number > 100
        //Generate a random int in range 50 - number :
        //in case number < 100
        //Generate a random int in range 0 - 50:
        //cast the random number to String
        //print

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("plz input Integer number: ");
        int userNumber = scanner.nextInt();

        if (userNumber > 100) {
            int moreHundred = random.nextInt(userNumber) + 50;
            String moreHondredToString = String.valueOf(moreHundred);
            System.out.println("when " + userNumber + " > 100 then random number is: " + moreHondredToString);

        } else if (userNumber < 100) {
            int noMoreHondred = random.nextInt(50);
            String noMoreHundredToString = String.valueOf(noMoreHondred);
            System.out.println("when " + userNumber + " < 100 then random number is: " + noMoreHundredToString);

        } else {
            System.out.println("User number is 100.");
        }

    }
}
