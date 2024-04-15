package homework;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("значение стороны а: ");
        int a = scanner.nextInt();

        System.out.print("значение стороны b: ");
        int b = scanner.nextInt();

        System.out.print("значение стороны c: ");
        int c = scanner.nextInt();

        if (isValidTriangle(a, b, c)) {
            System.out.println("треугольник существует.");
        } else {
            System.out.println("такого треугольника не существует.");
        }
        scanner.close();

    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}