package src.main;

import java.util.Scanner;

import java.util.Scanner;

public class deckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Card Number (1-52): ");
        int cardNumber = scanner.nextInt();

        if (cardNumber < 1 || cardNumber > 52) {
            System.out.println("Invalid card number. Please enter a number between 1 and 52.");
        } else {
            String card = getCard(cardNumber);
            System.out.println("The card you picked is " + card);
        }
    }

    // Function to get the card based on card number
    private static String getCard(int cardNumber) {
        // Calculate suit and rank indices
        int suitIndex = (cardNumber - 1) / 13;
        int rankIndex = (cardNumber - 1) % 13;

        String suit;
        // Determine the suit based on suitIndex using switch
        switch (suitIndex) {
            case 0:
                suit = "Clubs";
                break;
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Spades";
                break;
            default:
                suit = "Unknown";
        }

        String rank;
        // Determine the rank based on rankIndex using switch
        switch (rankIndex) {
            case 0:
                rank = "Ace";
                break;
            case 10:
                rank = "Jack";
                break;
            case 11:
                rank = "Queen";
                break;
            case 12:
                rank = "King";
                break;
            default:
                rank = String.valueOf(rankIndex + 1); 
        }

        // Combine rank and suit to get the card description
        return rank + " of " + suit;
    }
}
