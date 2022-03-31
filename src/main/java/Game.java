public class Game {
    public boolean isGreenLight;
    public int MAX_SPEED = 1;

    public Game (boolean isGreenLight){
        this.isGreenLight = isGreenLight;
    }


    public int calcDroppedOut(int[] speeds) { //первый метод - количество выбывающих
        int calcOut = 0;
        if (isGreenLight) {
            calcOut = 0;
        } else {
            for (int speed : speeds) {
                if (speed > MAX_SPEED) {
                    calcOut = calcOut + 1;
                }

            }
        }
        return calcOut;
    }

    public int[] outSpeeds(int[] speeds) { // второй метод - массив из скоростей выбывающих
        int cnt = 0;
        if (isGreenLight) {
            cnt = 0;
        } else {
            for (int speed : speeds) {
                if (speed > MAX_SPEED) {
                    cnt = cnt + 1;
                }

            }
        }
        int[] ans = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (speed > MAX_SPEED) {
                ans[i] = speed;
                i++;
            }
        }
        return ans;
    }

    public int[] inSpeeds(int[] speeds) { // третий метод - массив из скоростей не выбывающих
        int cnt2 = 0;
        if (isGreenLight) {
            for (int speed : speeds) {
                cnt2++;
            }
        } else {
            for (int speed : speeds) {
                if (speed <= MAX_SPEED) {
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
                if (speed <= MAX_SPEED) {
                    ans2[i] = speed;
                    i++;
                }
            }
        }
        return ans2;
    }
    public String[] getNames (String[] nameSpeeds) {
        int cnt = 0;
        for (String s : nameSpeeds) {
            String [] nameSpeed = s.split(" ");
            int value = Integer.parseInt (nameSpeed [1]);
            if (isGreenLight) {
                cnt++;
            }
            else if (value <= MAX_SPEED)
                cnt++;
        }
        String[] names = new String [cnt];
        int i = 0;
        for (String s : nameSpeeds) {
            String[] nameSpeed = s.split(" ");
            int value = Integer.parseInt(nameSpeed[1]);
            if (isGreenLight) {
                names[i] = nameSpeed[0];
                i++;
            } else if (value <= MAX_SPEED) {
                names[i] = nameSpeed[0];
                i++;
            }
        }
        return names;

    }

}