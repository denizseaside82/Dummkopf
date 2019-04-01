import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();
    private List<Card> cards = new ArrayList<>();

    public Game(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public Player getPlayer(int index){
        return players.get(index);
    }
}
