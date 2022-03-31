import java.util.Arrays;

class Main {


    public static void main(String[] args) {

        int[] speeds = { 0, 1, 2, 3 };

        Game game = new Game(false);

        int calcOut = game.calcDroppedOut(speeds);


        int[] offSpeeds = game.outSpeeds(speeds);


        int[] inSpeeds = game.inSpeeds(speeds);

        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        game.isGreenLight = true;

        String[] survNames = game.getNames(nameSpeed);

        System.out.println(Arrays.toString(survNames));









    }
}
