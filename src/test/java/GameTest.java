import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldCalcDropped() {
        int[] speeds = { 0, 1, 2, 3 };

        int actual = Game.calcDroppedOut(speeds);

        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldFindOutSpeeds() {
        int[] speeds = { 0, 1, 2, 3 };

        int[] actual = Game.outSpeeds(speeds);

        int[] expected = { 1, 2, 3 };

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindInSpeeds() {
        int[] speeds = { 0, 1, 2, 3 };

        int[] actual = Game.inSpeeds(speeds);

        int[] expected = { 0 };

        Assertions.assertArrayEquals(expected, actual);

    }
}
