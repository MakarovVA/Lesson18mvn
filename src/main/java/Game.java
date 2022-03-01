public class Game {
    static boolean isGreenLight = false;

    public static int calcDroppedOut(int[] speeds) { //первый метод - количество выбывающих
        int calcOut = 0;
        if (isGreenLight) {
            calcOut = 0;
        } else {
            for (int speed : speeds) {
                if (speed != 0) {
                    calcOut = calcOut + 1;
                }

            }
        }
        return calcOut;
    }

    public static int[] outSpeeds(int[] speeds) { // второй метод - массив из скоростей выбывающих
        int cnt = 0;
        if (isGreenLight) {
            cnt = 0;
        } else {
            for (int speed : speeds) {
                if (speed != 0) {
                    cnt = cnt + 1;
                }

            }
        }
        int[] ans = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (speed != 0) {
                ans[i] = speed;
                i++;
            }
        }
        return ans;
    }

    public static int[] inSpeeds(int[] speeds) { // третий метод - массив из скоростей не выбывающих
        int cnt2 = 0;
        if (isGreenLight) {
            for (int speed : speeds) {
                cnt2++;
            }
        } else {
            for (int speed : speeds) {
                if (speed == 0) {
                    cnt2++;
                }
            }
        }
        int[] ans2 = new int[cnt2];
        int i = 0;
        if (isGreenLight) {
            for (int speed : speeds) {
                ans2[i] = speed;
                i++;
            }
        } else {
            for (int speed : speeds) {
                if (speed == 0) {
                    ans2[i] = speed;
                    i++;
                }
            }
        }
        return ans2;
    }
}