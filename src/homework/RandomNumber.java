package homework;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Random randomNum = new Random();

        Scanner scannerNum = new Scanner(System.in);

        // генератор чисел
        int num1 = randomNum.nextInt(8) + 2;
        int num2 = randomNum.nextInt(8) + 2;

        System.out.println("Число раз: " + num1);
        System.out.println("Число два: " + num2);

        // результат юзера
        System.out.print("Результат умножения: ");
        int userAnswer = scannerNum.nextInt();

        // вычисляем правильный ответ
        int correctAnswer = num1 * num2;
        System.out.println("Ответ: " + correctAnswer);

        // проверяем ответ юзера
        boolean isCorrect = (userAnswer == correctAnswer);
        System.out.println("Результат: " + isCorrect);

    }
}
