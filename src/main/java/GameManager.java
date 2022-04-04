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
    int loser(Movable p1, Movable p2, int rounds) {
        int cnt1 = 0;
        for (int i = 0; i < rounds; i++) {
            boolean failed1 = game.isFailed(p1.getSpeed());
            boolean failed2 = game.isFailed(p2.getSpeed());
            if (failed1 == true && failed2 == true) {
                return 0;
            }
           else if (failed1 == false && failed2 == true) {
               return 1;
            }
           else if (failed1 == true && failed2 == false) {
               return -1;
            }


        }
        return 0;
    }
}
