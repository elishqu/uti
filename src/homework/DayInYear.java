package homework;

import java.util.Scanner;

public class DayInYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int daysInYear;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysInYear = 366;
        } else {
            daysInYear = 365;
        }
        System.out.printf("количество дней в году %d", daysInYear);

        scanner.close();
    }
}
