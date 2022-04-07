import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxesTest {

    @Test
    public void test1 () {
        Taxes taxes = new Taxes(0,0);

        taxes.increaseIncomes(500);
        taxes.increaseExpanses(100);
        taxes.increaseIncomes(-100);
        taxes.increaseExpanses(-100);

        double expected = 60;
        double actual = taxes.getTax15Percent();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2 () {
        Taxes taxes = new Taxes(0,0);

        taxes.increaseIncomes(500);
        taxes.increaseIncomes(-100);


        double expected = 30;
        double actual = taxes.getTaxSixPercent();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test3 () {
        Taxes taxes = new Taxes(0,0);

        taxes.increaseIncomes(100);
        taxes.increaseExpanses(500);

        double expected = 0;
        double actual = taxes.getTax15Percent();

        Assertions.assertEquals(expected, actual);
    }
}