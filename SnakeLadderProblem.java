package com.pratice;

import java.util.Random;

public class SnakeLadderProblem {
    public static void main (String args[]){
        System.out.println("Welcome to SnakeLadderProblem");
        int startPosition = 0;
    }
    private static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
