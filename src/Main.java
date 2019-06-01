import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {


        //Ask for a number of Cards
        System.out.println("Number of Cards (24/36/52)");
        int numberOfCards = scanner.nextInt();
        Deck cards = new Deck(numberOfCards);

        //Initialize Deck and then shuffle
//        Card[] deck = cards.initDeck();
        cards.shuffle();
//        System.out.println(cards.toString());

        for(Player actualPlayers: players){
            actualPlayers.setHand(cards.getCards());
            System.out.println(actualPlayers.getHand());
        }
//        for(int i = 0; i < numberOfCards; i++){
//            System.out.println(cards.get(i));
//        }

        //Deal 6 of shuffled cards to numberOfPlayers
    }
}