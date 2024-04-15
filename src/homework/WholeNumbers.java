package homework;

import java.util.Scanner;

public class WholeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Выведите три целых числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( (a % 2 == 0 && b % 2 != 0) ||
             (a % 2 != 0 && b % 2 == 0) ||
             (a % 2 == 0 && c % 2 != 0) ||
             (a % 2 != 0 && c % 2 == 0) ||
             (b % 2 == 0 && c % 2 != 0) ||
             (b % 2 != 0 && c % 2 == 0)  )
         {
             System.out.println("Есть");
        } else {
            System.out.println("Отсутсвуют");
        }
    }
}
