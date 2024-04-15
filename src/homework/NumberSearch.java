package homework;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите предел чисел: ");
        int limit = scanner.nextInt();

        System.out.print("введите число-сумму: ");
        int targetSum = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                for (int k = 1; k <= limit; k++) {
                    if (i + j + k == targetSum) {
                        System.out.println(i + " + " + j + " + " + k + " = " + targetSum);
                    }
                }
            }
        }
    }
}
