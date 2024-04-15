package homework;

import java.util.Scanner;

public class MoneyRoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость телефона: ");
        int pricePhone = scanner.nextInt();

        System.out.print("Введите кол-во денег в кармане: ");
        int moneyCarman = scanner.nextInt();

        int change = moneyCarman - pricePhone;
        boolean enoughMoney = change >= 10;

        if (enoughMoney) {
            System.out.printf("Денег хватит. Сдача: %d рублей", change);
        } else {
            System.out.println("Денег не хватит");
        }
    }
}
