package homework;

import java.util.Scanner;

public class EvenlyOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите число: ");
        int number = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number = number / 10;
        }
        System.out.printf("четные: %d", evenCount);
        System.out.println(" ");
        System.out.printf("нечетные: %d", oddCount);
    }
}
