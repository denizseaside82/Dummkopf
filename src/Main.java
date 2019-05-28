import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask for a number of Players
        System.out.println("Number of Players");
        int numberOfPlayers = scanner.nextInt();

//      Player[] players = new Player[numberOfPlayers];
//        ArrayList<String> players = new ArrayList<>(numberOfPlayers);

        //Based on number of players, set players name
        int count=0;
        while(count < numberOfPlayers){
            System.out.println("Please enter the names");
            String playerName = scanner.next();
            new Player(playerName);
            count++;
        }

        //Ask for a number of Cards
        System.out.println("Number of Cards (24/36/52)");
        int numberOfCards = scanner.nextInt();
        Deck cards = new Deck(numberOfCards);

        //Initialize Deck and then shuffle
        Card[] deck = cards.initDeck();
        Card[] shuffleCard = cards.shuffle();
//        for(int i = 0; i < deck.length; i++){
//            System.out.println(deck[i]);
//        }
//
        //Deal 6 of shuffled cards to numberOfPlayers
        cards.shuffleDeckToPlayers(numberOfPlayers);
    }
}