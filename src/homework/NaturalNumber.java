package homework;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");

        int number = scanner.nextInt();

        int maxDigit = 0;
        int currentDigit;

        while (number > 0) {
            currentDigit = number % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            } number = number / 10;
            System.out.printf("Наибольшая цифра в числе: %d", maxDigit);
            break;
        }
    }
}
