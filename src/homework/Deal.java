package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        List<String> deck = new ArrayList<>();
        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(rank + " of " + suit);
            }
        }

        Collections.shuffle(deck);

        int cardsPerPlayer = 5;
        int totalCards = n * cardsPerPlayer;

        for (int i = 0; i < totalCards; i += cardsPerPlayer) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.print(deck.get(i + j) + " ");
            }
            System.out.println();
        }
    }
}
