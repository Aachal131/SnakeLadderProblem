package com.pratice;

import java.util.Random;

public class SnakeLadderProblem {
    public static void main (String args[]){
        int startPosition =0;
        System.out.println("Welcome to SnakeLadderProblem");
        Random random = new Random();


            int diceValue = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            switch (option) {
                case 0:
                    System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder!");
                    startPosition  += diceValue;
                    break;
                case 2:
                    System.out.println("Snake!");
                    startPosition  -= diceValue;
                    if (startPosition  < 0) {
                        startPosition  = 0;
                    }
                    break;
            }

            System.out.println("Dice value: " + diceValue);
            System.out.println("Current position: " + startPosition );
            System.out.println("--------------------");


        }


    }

