import java.util.Arrays;

class Main {


    public static void main(String[] args) {

        StepCounter stepCounter = new StepCounter();

        stepCounter.add(1, 15);
        stepCounter.add(300, 10);
        try {
            stepCounter.add(300, -1);
        } catch (IllegalStepsException e) {
            System.out.println(e.getMessage());
        }
        try {
            stepCounter.add(400, 2);
        } catch (IllegalDayException e) {
            System.out.println(e.getMessage());
        }




    }
}