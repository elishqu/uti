package homework;

import java.util.Random;
import java.util.Scanner;

public class GeneratorRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100. У вас 10 попыток");

        for (int i = 0; i < 10; i++) {
            System.out.print("Попытка " + (i + 1) + ". Введите число: ");
            int userNumber = scanner.nextInt();

            if (userNumber == secretNumber) {
                System.out.println("красава");
                break;
            } else if (userNumber < secretNumber) {
                System.out.println("бери больше");
            } else {
                System.out.println("бери меньше");
            }
        }

        System.out.printf("лох. секретное число: %d", secretNumber);
    }
}
