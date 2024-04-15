package homework;

import java.util.Random;
import java.util.Scanner;

public class GeneratorPseudoNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int totalNumbers = 1000;
        int eventCount = 0;

        for(int i = 0; i < totalNumbers; i++) {
            int randomNumber = random.nextInt();
            if (randomNumber % 2 == 0) {
                eventCount++;
            }
        }

        double evenPercentage = (double) eventCount * 100 / totalNumbers;
        System.out.print("Процент четных чисел в выборке: " + evenPercentage + "%");

    }
}
