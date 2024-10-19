import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.printf("Enter five number between 1 and 30=>%n");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.printf("Number%d: ", i + 1);
                num[i] = input.nextInt();
                if (num[i] > 30 || num[i] < 1) {
                    System.out.printf("Invalid input! Enter again=>%n");
                }
            } while (num[i] > 30 || num[i] < 1);
        }
        System.out.printf("Bar of asterisks=>%n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < num[i]; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        input.close();
    }
}