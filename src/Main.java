import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask for a number of Players
        System.out.println("Number of Players");
        int numberOfPlayers = scanner.nextInt();
        Player players = new Player(numberOfPlayers);

        //Ask for a number of Cards
        System.out.println("Number of Cards (24/36/52)");
        int numberOfCards = scanner.nextInt();
        Deck cards = new Deck(numberOfCards);


        Card[] deck = cards.initDeck();

        for(int i = 0; i < deck.length; i++){
            System.out.println(deck[i]);
        }

        System.out.println("========================");

        Card[] shuffleCard = cards.shuffle();
        for(int i = 0; i < shuffleCard.length; i++){
            System.out.println(shuffleCard[i]);
        }
    }
}
