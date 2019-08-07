import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                newGame.showTrump();

                //Play clockwise
                Map<Player, Integer> lowestTrump = new HashMap<Player, Integer>();
                for (Player player : players) {
                    int cardNumber = player.getSuitInHand();
                    lowestTrump.put(player, cardNumber);
                    System.out.println("The smallest card from " + player.getName() + " is " + player.getSuitInHand());
//                    System.out.println("\n");
                }
                System.out.println("\n");
                String attackerFound = "";
                for (Map.Entry<Player, Integer> tempLowestTrump : lowestTrump.entrySet()) {
                    Player key1 = tempLowestTrump.getKey();
                    int value1 = tempLowestTrump.getValue();

                    for (Map.Entry<Player, Integer> secondLowestTrump : lowestTrump.entrySet()) {
                        Player key2 = secondLowestTrump.getKey();
                        int value2 = secondLowestTrump.getValue();

                        if (value1 < value2) {
//                            System.out.println("Player : " + key1.getName() + " is the first attacker");
                            attackerFound = key1.getName();
                        }
                    }
                }

                System.out.println("Player : " + attackerFound+ " is the first attacker");

            }
            //Shuffle deck and dealDeck each player 6 cards


            //Let the bottom card of the stock is turned and placed face up on the table
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}