import java.util.Comparator;

public class StepCounterComparator implements Comparator<StepCounter> {

    private int min;

    public StepCounterComparator(int min) {
        this.min = min;
    }

    @Override
    public int compare(StepCounter o1, StepCounter o2) {
        return o1.quantityMoreThanMin(min) - o2.quantityMoreThanMin(min);
    }
}
