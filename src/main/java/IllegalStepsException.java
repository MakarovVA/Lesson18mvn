public class IllegalStepsException extends RuntimeException {

    public IllegalStepsException (int steps) {
        super("Указано неверное количество шагов: " + steps);
    }
}
