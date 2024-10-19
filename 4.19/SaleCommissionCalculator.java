import java.util.Scanner;

public class SaleCommissionCalculator {
    public static void main(String[] arg) {
        int[] item_num = new int[4];
        double[] item_value = { 239.99, 129.75, 99.95, 350.89 };
        double earning = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the number of items that sold by saleperson:%n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("item%d: ", i + 1);
            item_num[i] = input.nextInt();
            earning += item_num[i] * item_value[i];
        }
        System.out.printf("Saleperson earned $%.2f last week", total_earning(earning));
        input.close();
    }

    public static double total_earning(double num) {
        return (200 + num * 0.09);
    }
}