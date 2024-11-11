import java.security.SecureRandom;

public class Race {
    private static SecureRandom random = new SecureRandom();
    private static final int MAXLENGTH = 70; // 賽道長度
    private int tortoise_pos; // 烏龜起始位置
    private int hare_pos;// 兔子起始位置

    public Race() {
        this.tortoise_pos = 1;
        this.hare_pos = 1;
    }

    public void test() {
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise_pos < MAXLENGTH && hare_pos < MAXLENGTH) {
            Move_hare();
            Move_tortise();
            printCurrentPos(); // 每次印出當前位置
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (tortoise_pos >= MAXLENGTH && hare_pos >= MAXLENGTH) {
            System.out.println("It's a tie.");
        }
        if (hare_pos >= MAXLENGTH) {
            System.out.println("Hare wins. Yuch.");
        } else {
            System.out.println("TORTOISE WINS!!! YAY!!!");
        }

    }

    public void Move_tortise() {
        int move = random.nextInt(10) + 1; // 隨機生成1~10之間的數字
        if (move <= 5) { // 50% Fast plod
            tortoise_pos = tortoise_pos + 3;
        } else if (move <= 7) {// 20% Slip
            tortoise_pos = tortoise_pos - 6;
        } else {// 30% Slow plod
            tortoise_pos = tortoise_pos + 1;
        }
        // 判斷離開起點
        if (tortoise_pos < 1) {
            tortoise_pos = 1;
        }
        // 超出終點
        if (tortoise_pos > MAXLENGTH) {
            tortoise_pos = MAXLENGTH;
        }
    }

    public void Move_hare() {
        int move = random.nextInt(10) + 1;
        if (move <= 2) {
            hare_pos = hare_pos + 0;
        } else if (move <= 4) {
            hare_pos = hare_pos + 9;
        } else if (move <= 5) {
            hare_pos = hare_pos - 12;
        } else if (move <= 8) {
            hare_pos = hare_pos + 1;
        } else {
            hare_pos = hare_pos - 2;
        }

        // 判斷離開起點
        if (hare_pos < 1) {
            hare_pos = 1;
        }
        // 超出終點
        if (hare_pos > MAXLENGTH) {
            hare_pos = MAXLENGTH;
        }
    }

    public void printCurrentPos() {
        String[] road = new String[MAXLENGTH];// 每次移動印出賽道
        System.out.printf("Tortise current position:%d%n", tortoise_pos);
        System.out.printf("Hare current position:%d%n", hare_pos);

        for (int i = 1; i < MAXLENGTH; i++) {
            road[i] = "-";
            if (i == tortoise_pos && i == hare_pos) {
                road[i] = "OUCH!!!";
            }
            if (i == tortoise_pos) {
                road[i] = "T";
            }
            if (i == hare_pos) {
                road[i] = "H";
            }
            System.out.printf("%s", road[i]);
        }
        System.out.println();
    }
}