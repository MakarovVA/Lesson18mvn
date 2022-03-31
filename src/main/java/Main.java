import java.util.Arrays;

class Main {


    public static void main(String[] args) {

        Game game = new Game(false);

        boolean failed = game.isFailed(1);

        if (failed) {
            System.out.println("Игрок выбывает");
        } else {
            System.out.println("Игрок не выбывает");
        }

        Game spd = new SpeedyGame(false, 5);

        boolean failed2 = spd.isFailed(2);

        if (failed2) {
            System.out.println("Игрок выбывает");
        } else {
            System.out.println("Игрок не выбывает");
        }










    }
}
