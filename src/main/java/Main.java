import java.util.Arrays;

class Main {


    public static void main(String[] args) {

        int[] speeds = { 0, 1, 2, 3 };

        int calcOut = Game.calcDroppedOut(speeds);


        int[] offSpeeds = Game.outSpeeds(speeds);


        int[] inSpeeds = Game.inSpeeds(speeds);

        String[] nameSpeed = {"Ivan 2", "Egor 3", "Olga 4", "Petr 5"};

        Game.isGreenLight = true;

        String[] survNames = Game.getNames(nameSpeed);

        System.out.println(Arrays.toString(survNames));







    }
}
