import java.util.HashMap;
import java.util.Map;

public class StepCounter {

    Map<Integer, Integer> steps = new HashMap<>();

    public int add(int day, int step) {
        if (steps.containsKey(day)) {
            int value = steps.get(day);
            steps.put(day, value + step);
        } else {
            steps.put(day, step);
        }
        int max = 0;
        for (int value : steps.values()) {
            if (value > max) {
                max = value;
            }

        }
        return max - steps.get(day) + 1;
    }

}
