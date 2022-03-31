import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldCalcDropped() {
        Game game = new Game(false);

        int[] speeds = { 0, 1, 2, 3 };

        int actual = game.calcDroppedOut(speeds);

        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindOutSpeeds() {
        Game game = new Game(false);

        int[] speeds = { 0, 1, 2, 3 };

        int[] actual = game.outSpeeds(speeds);

        int[] expected = { 2, 3 };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindInSpeeds() {
        Game game = new Game(false);

        int[] speeds = { 0, 1, 2, 3 };

        int[] actual = game.inSpeeds(speeds);

        int[] expected = { 0, 1 };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void allSurvives() {
        Game game = new Game(true);

        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        String[] expected = {"Ivan", "Egor", "Olga", "Petr"};

        String[] actual = game.getNames(nameSpeed);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void allLose() {
        Game game = new Game(false);

        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        game.MAX_SPEED = 1;

        String[] expected = {};

        String[] actual = game.getNames(nameSpeed);

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void someLose() {
        Game game = new Game(false);

        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        game.MAX_SPEED = 3;

        String[] expected = {"Ivan", "Egor"};

        String[] actual = game.getNames(nameSpeed);

        Assertions.assertArrayEquals(expected, actual);
    }
}
