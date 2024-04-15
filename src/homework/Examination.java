package homework;

import java.util.Scanner;

public class Examination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Число а: ");
        int a = scanner.nextInt();

        System.out.print("Число b: ");
        int b = scanner.nextInt();

        boolean examinationInt = (a % b == 0);

        System.out.println(examinationInt);
    }
}
