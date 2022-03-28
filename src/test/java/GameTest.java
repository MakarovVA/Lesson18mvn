import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldCalcDropped() {
        int[] speeds = { 0, 1, 2, 3 };

        int actual = Game.calcDroppedOut(speeds);

        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindOutSpeeds() {
        int[] speeds = { 0, 1, 2, 3 };

        int[] actual = Game.outSpeeds(speeds);

        int[] expected = { 2, 3 };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindInSpeeds() {
        int[] speeds = { 0, 1, 2, 3 };

        int[] actual = Game.inSpeeds(speeds);

        int[] expected = { 0, 1 };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void allSurvives() {
        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        Game.isGreenLight = true;

        String[] expected = {"Ivan", "Egor", "Olga", "Petr"};

        String[] actual = Game.getNames(nameSpeed);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void allLose() {
        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        Game.isGreenLight = false;

        Game.MAX_SPEED = 1;

        String[] expected = {};

        String[] actual = Game.getNames(nameSpeed);

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void someLose() {
        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        Game.isGreenLight = false;

        Game.MAX_SPEED = 3;

        String[] expected = {"Ivan", "Egor"};

        String[] actual = Game.getNames(nameSpeed);

        Assertions.assertArrayEquals(expected, actual);
    }
}
