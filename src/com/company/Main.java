package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;

        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;

        if (isCar != false) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;

        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
