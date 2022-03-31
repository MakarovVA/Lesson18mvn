public class Game {
    protected boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean isGreenLight() {
        return isGreenLight;
    }

    public void setGreenLight(boolean greenLight) {
        isGreenLight = greenLight;
    }
    boolean isFailed(int speed) {
        if (isGreenLight) {
            return false;
        } else return speed != 0;
    }
}