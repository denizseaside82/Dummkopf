import com.sun.jdi.Value;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            //Create players between 2-6
            Game newGame = new Game();
            List<Player> players = newGame.createPlayers();

            //Create deck
            if (players != null) {
                newGame.createDeck(players);
                for (Player player : players) {
                    System.out.println("Player : " + player.getName());
                    player.showHand();
                    System.out.println("\n");
                }
                //Let the bottom card of the stock is turned and placed face up on the table
                newGame.showTrump();

                //Shuffle deck and dealDeck each player 6 cards
                Map<Player, Integer> lowestTrump = new HashMap<Player, Integer>();
                for (Player player : players) {
                    int cardNumber = player.getSuitInHand();
                    lowestTrump.put(player, cardNumber);
                    if (cardNumber == -1) {
                        System.out.println("Player " + player.getName() + " has no TRUMP");
                    } else {
                        System.out.println("The smallest card from " + player.getName() + " is " + player.getSuitInHand());
                    }
                }
                System.out.println("\n");

                Optional<Player> result = lowestTrump.entrySet()
                        .stream()
                        .filter(c -> c.getValue() != -1)
                        .min(Comparator.comparingInt(Map.Entry::getValue))
                        .map(Map.Entry::getKey);

                if (result != null && result.get().getSuitInHand() != -1) {
                    System.out.println("Player : " + result.get().getName() + " is the first attacker");
                }

                System.out.println(lowestTrump.get(result.get().getName()).);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}