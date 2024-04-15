package lessn_7;

public class HomeWork {
    public static void main(String[] args) {
        String name = "     ПЕтРов Олег Иванович     ";

        // верхний регистр
        name = name.toUpperCase();

        // -пробелы
        name = name.trim();

//        System.out.println(name);

        // проверяем на инвалида
        if (name.contains("ОВА")) {
            System.out.printf("Уважаемая" + " " + name);
        } else if (name.contains("ОВ")) {
            System.out.println("Уважаемый" + " " + name);
        } else {
            System.out.println("Неизвестное лицо" + " " + name);
        }

    }
}
