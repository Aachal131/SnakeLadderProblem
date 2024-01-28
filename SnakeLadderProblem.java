package com.pratice;

import java.util.Random;

public class SnakeLadderProblem {
    public static void main (String args[]){
        playGame();
    }
    private static void playGame() {
        Random random = new Random();
        int[] playerPositions = {0, 0};
        int currentPlayer = 0;
        int diceRolls = 0;

        while (playerPositions[currentPlayer] < 100) {
            int diceValue = rollDice(random);
            diceRolls++;
            playerPositions[currentPlayer] += diceValue;

            playerPositions[currentPlayer] = checkSnakesAndLadders(playerPositions[currentPlayer]);

            System.out.println("Player " + (currentPlayer + 1) + " rolled a " + diceValue +
                    " and is now at position " + playerPositions[currentPlayer]);

            if (diceValue != 6) {
                currentPlayer = (currentPlayer + 1) % 2;  // Switch to the other player
            }
        }
        System.out.println("Player " + (currentPlayer + 1) + " wins!");
        System.out.println("Number of dice rolls: " + diceRolls);
    }

    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }

    private static int checkSnakesAndLadders(int position) {
        // Customize the snake and ladder positions as needed
        switch (position) {
            case 1:
                System.out.println("Player landed on a ladder! Climbing to position 38.");
                return 38;
            case 32:
                System.out.println("Player landed on a snake! Sliding down to position 10.");
                return 10;
            case 4:
                System.out.println("Player landed on a ladder! Climbing to position 14.");
                return 14;
            case 36:
                System.out.println("Player landed on a snake! Sliding down to position 6.");
                return 6;
            case 8:
                System.out.println("Player landed on a ladder! Climbing to position 30.");
                return 30;
            case 48:
                System.out.println("Player landed on a snake! Sliding down to position 26.");
                return 26;
            case 21:
                System.out.println("Player landed on a ladder! Climbing to position 42.");
                return 42;
            case 62:
                System.out.println("Player landed on a snake! Sliding down to position 18.");
                return 18;
            case 28:
                System.out.println("Player landed on a ladder! Climbing to position 76.");
                return 76;
            case 88:
                System.out.println("Player landed on a snake! Sliding down to position 24.");
                return 24;
            case 50:
                System.out.println("Player landed on a ladder! Climbing to position 67.");
                return 67;
            case 95:
                System.out.println("Player landed on a snake! Sliding down to position 56.");
                return 56;
            case 71:
                System.out.println("Player landed on a ladder! Climbing to position 92.");
                return 92;
            case 97:
                System.out.println("Player landed on a snake! Sliding down to position 78.");
                return 78;
            default:
                return position;
        }
    }
}
