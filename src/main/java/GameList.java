import java.util.ArrayList;

public class GameList {
    private static GameList instance;
    private ArrayList<Game> games;

    private GameList() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.games = new ArrayList<Game>();
    }

    public static GameList getInstance() {
        if (instance == null) {
            instance = new GameList();
        }
        return instance;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void addGame(Game game){
        games.add(game);
    }
}
