public class GameManager {
    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int surviveRounds (int [] speeds) {
        int rounds = 0;
        for (int speed : speeds) {
            if (game.isFailed(speed)) {
                break;
            } else {
                rounds++;
            }
        }
        return rounds;
    }
}
