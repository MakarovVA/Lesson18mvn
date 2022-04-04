public class FastPlayer implements Movable {

    private int speed;

    private int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        this.speed = startSpeed;
        this.speedStep = speedStep;
    }

    @Override
    public int getSpeed() {
        int currentSpeed = speed;
        speed += speedStep;
        return currentSpeed;
    }
}
