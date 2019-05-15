import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask for a number of Players
        System.out.println("Number of Players");
        int numberOfPlayers = scanner.nextInt();

//      Player[] players = new Player[numberOfPlayers];
        ArrayList<Player> players = new ArrayList<Player>(numberOfPlayers);

        //Based on number of players, set players name
        int count=0;
        while(count < numberOfPlayers){
            String playerName = scanner.next();
            players.add(playerName);
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
        shuffleDeckToPlayers(numberOfPlayers);
    }
}
