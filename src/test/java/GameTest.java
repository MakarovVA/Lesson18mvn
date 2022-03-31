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





}
