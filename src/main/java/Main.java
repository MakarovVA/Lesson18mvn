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

        GameManager gameManager = new GameManager(game);

        int[] speeds = {0, 0, 0, 1, 2};

        System.out.println("Количество раундов: " + gameManager.surviveRounds(speeds));

        GameManager gameManager2 = new GameManager(spd);

        int[] speeds2 = {1, 2, 3, 4, 6};

        System.out.println("Количество раундов: " + gameManager2.surviveRounds(speeds2));

        Movable movable1 = new ConstantPlayer (5);

        System.out.println(movable1.getSpeed());
        System.out.println(movable1.getSpeed());
        System.out.println(movable1.getSpeed());
        System.out.println(movable1.getSpeed());

        Movable movable2 = new FastPlayer(10, 5);

        System.out.println(movable2.getSpeed());
        System.out.println(movable2.getSpeed());
        System.out.println(movable2.getSpeed());
        System.out.println(movable2.getSpeed());











    }
}
