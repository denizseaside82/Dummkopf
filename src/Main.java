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
                newGame.showTrump();

                //Play clockwise
                Map<Player, Integer> lowestTrump = new HashMap<Player, Integer>();
                for (Player player : players) {
                    int cardNumber = player.getSuitInHand();
                    lowestTrump.put(player, cardNumber);
                    if(cardNumber == -1){
                        System.out.println("Player " + player.getName() + " has no TRUMP");
                    }else {
                        System.out.println("The smallest card from " + player.getName() + " is " + player.getSuitInHand());
//                    System.out.println("\n");
                    }
                }
                System.out.println("\n");
                String attackerFound = "";

//                Optional<Integer> result = lowestTrump.values().stream().min(Integer::compareTo);

                Optional<Object> result = lowestTrump.entrySet()
                        .stream()
                        .filter(c -> c.getValue() != null)
                        .min(Comparator.comparingInt(Map.Entry::getValue))
                        .map(Map.Entry::getKey);
//                attackerFound = result != null && result.get() != -1 ? result.get().toString() : null;
                if(result != null && result.get() != -1) {
//                    attackerFound = result.get().toString();
                    System.out.println("Player : " + result.get().toString() + " is the first attacker");

                }


            }
            //Shuffle deck and dealDeck each player 6 cards


            //Let the bottom card of the stock is turned and placed face up on the table
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}