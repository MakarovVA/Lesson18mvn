public class IllegalDayException extends RuntimeException {

    public IllegalDayException(int day) {
        super("Указан неверный день: " + day);

    }
}
