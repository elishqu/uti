package homework;

import java.util.Scanner;

public class CityHomeWork {
    public static void main(String[] args) {

        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        int isCity = 0;

        while (isCity < 10) {
            System.out.print("Хотите добавить город? (д/н): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("д")) {
                System.out.print("Название города: ");
                String city = scanner.nextLine();

                array[isCity] = city;
                System.out.println("Город " + city + " успешно добавлен в список");

                isCity++;
            } else if (choice.equalsIgnoreCase("н")) {
                break;
            } else {
                System.out.println("ееее пиши нормальна");
            }
        }

        isCity = 0;
        while (isCity < 10) {
            System.out.print("Хотите уничтожить город из списка? (д/н): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("д")) {
                System.out.print("Введите название города для уничтожения: ");
                String cityToDelete = scanner.nextLine();

                boolean cityFound = false;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != null && array[i].equalsIgnoreCase(cityToDelete)) {
                        array[i] = null;
                        cityFound = true;
                        System.out.println("Город " + cityToDelete + " уничтожен");
                        break;
                    }
                }

                if (!cityFound) {
                    System.out.println("Такого города нет");
                }
            } else if (choice.equalsIgnoreCase("н")) {
                break;
            } else {
                System.out.println("ееее пиши нормальна");
            }
        }
        System.out.println(" ");

        int emptyCount = 0;
        for (String city : array) {
            if (city == null) {
                emptyCount++;
            }
        }
        System.out.println("Количество пустых ячеек в списке: " + emptyCount);

        System.out.println("Список городов:");
        for (String city : array) {
            if (city != null) {
                System.out.println(city);
            }
        }

    }
}
