package homework;

import java.util.Scanner;

public class VariableCar {
    public static void main(String[] args) {

        String carBrand = "Lada Granta";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название марки: ");
        String inputBrand = scanner.next();

        boolean isCorrectBrand = carBrand.equalsIgnoreCase(inputBrand);
        System.out.println(isCorrectBrand);
    }
}
