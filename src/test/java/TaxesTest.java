import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxesTest {
    @Test
    public void test1 () {
        StepCounter stepcounter = new StepCounter();

        int expected = 1;
        int actual = stepcounter.add(1,0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2 () {
        StepCounter stepcounter = new StepCounter();
        stepcounter.add(1,100);
        stepcounter.add(2,200);

        int expected = 96;
        int actual = stepcounter.add(1,5);

        Assertions.assertEquals(expected, actual);
    }

}