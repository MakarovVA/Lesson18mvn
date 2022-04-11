import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StepCounterTest {
    @Test
    public void test1() {
        StepCounter stepcounter = new StepCounter();

        int expected = 1;
        int actual = stepcounter.add(1, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        StepCounter stepcounter = new StepCounter();
        stepcounter.add(1, 100);
        stepcounter.add(2, 200);

        int expected = 96;
        int actual = stepcounter.add(1, 5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        StepCounter stepCounter1 = new StepCounter();
        StepCounter stepCounter2 = new StepCounter();

        stepCounter1.add(1, 100);
        stepCounter2.add(1, 20);
        stepCounter2.add(2, 80);

        int expected = 0;
        int actual = stepCounter1.compareTo(stepCounter2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        StepCounter stepCounter1 = new StepCounter();
        StepCounter stepCounter2 = new StepCounter();

        stepCounter1.add(1, 90);
        stepCounter2.add(1, 20);
        stepCounter2.add(2, 80);

        int expected = -10;
        int actual = stepCounter1.compareTo(stepCounter2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test5() {
        StepCounter stepCounter1 = new StepCounter();
        StepCounter stepCounter2 = new StepCounter();

        stepCounter1.add(1, 110);
        stepCounter2.add(1, 20);
        stepCounter2.add(2, 80);

        int expected = 10;
        int actual = stepCounter1.compareTo(stepCounter2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        StepCounter stepCounter1 = new StepCounter();
        StepCounter stepCounter2 = new StepCounter();

        stepCounter1.add(1, 110);
        stepCounter2.add(1, 20);
        stepCounter2.add(2, 80);

        int expected = 10;
        int actual = stepCounter1.compareTo(stepCounter2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        StepCounter stepCounter1 = new StepCounter();
        StepCounter stepCounter2 = new StepCounter();
        StepCounterComparator comparator = new StepCounterComparator(30);

        stepCounter1.add(1, 90);
        stepCounter2.add(1, 20);
        stepCounter2.add(2, 80);

        int expected = 10;
        int actual = comparator.compare(stepCounter1, stepCounter2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test8() {
        StepCounter stepCounter1 = new StepCounter();
        StepCounter stepCounter2 = new StepCounter();
        StepCounterComparator comparator = new StepCounterComparator(30);

        stepCounter1.add(1, 110);
        stepCounter2.add(1, 40);
        stepCounter2.add(2, 70);

        int expected = 0;
        int actual = comparator.compare(stepCounter1, stepCounter2);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        StepCounter stepCounter1 = new StepCounter();
        StepCounter stepCounter2 = new StepCounter();
        StepCounterComparator comparator = new StepCounterComparator(30);

        stepCounter1.add(1, 110);
        stepCounter2.add(1, 50);
        stepCounter2.add(2, 80);

        int expected = -20;
        int actual = comparator.compare(stepCounter1, stepCounter2);

        Assertions.assertEquals(expected, actual);
    }
}