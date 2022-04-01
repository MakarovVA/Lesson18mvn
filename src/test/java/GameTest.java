import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void greenGameNotFailed () {

        Game game = new Game(true);

        boolean expected = false;

        boolean actual = game.isFailed(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void redGameNotFailed () {

        Game game = new Game(false);

        boolean expected = false;

        boolean actual = game.isFailed(0);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void redGameFailed () {

        Game game = new Game(false);

        boolean expected = true;

        boolean actual = game.isFailed(1);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void greenSpdGameNotFailed () {

        Game game = new SpeedyGame(true, 1);

        boolean expected = false;

        boolean actual = game.isFailed(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void redSpdGameNotFailed () {

        Game game = new SpeedyGame(false, 2);

        boolean expected = false;

        boolean actual = game.isFailed(1);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void redSpdGameFailed () {

        Game game = new SpeedyGame(false, 2);

        boolean expected = true;

        boolean actual = game.isFailed(4);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void greenGameAllSurvive () {
        Game game = new Game(true);

        GameManager gameManager = new GameManager(game);

        int[] speeds = {0, 0, 0, 1, 2};

        int expected = 5;

        int actual = gameManager.surviveRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void greenSpeedyGameAllSurvive () {

        Game game = new SpeedyGame(true, 3);

        GameManager gameManager = new GameManager(game);

        int[] speeds = {0, 0, 0, 1, 2};

        int expected = 5;

        int actual = gameManager.surviveRounds(speeds);

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void greenSpeedyGameAllLose () {

        Game game = new SpeedyGame(false, 3);

        GameManager gameManager = new GameManager(game);

        int[] speeds = {4, 5, 6, 7, 2};

        int expected = 0;

        int actual = gameManager.surviveRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void greenGameAllLose () {

        Game game = new Game(false);

        GameManager gameManager = new GameManager(game);

        int[] speeds = {4, 5, 6, 7, 2};

        int expected = 0;

        int actual = gameManager.surviveRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void greenGameSomeSurvive () {

        Game game = new Game(false);

        GameManager gameManager = new GameManager(game);

        int[] speeds = {0, 0, 6, 7, 2};

        int expected = 2;

        int actual = gameManager.surviveRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void greenSpeedyGameSomeSurvive () {

        Game game = new SpeedyGame(false, 3);

        GameManager gameManager = new GameManager(game);

        int[] speeds = {1, 2, 1, 7, 2};

        int expected = 3;

        int actual = gameManager.surviveRounds(speeds);

        Assertions.assertEquals(expected, actual);
    }


}
