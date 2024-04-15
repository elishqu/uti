package homework;

public class DaysWeek {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Понедельник";
        daysOfWeek[1] = "Вторник";
        daysOfWeek[2] = "Среда";
        daysOfWeek[3] = "Четверг";
        daysOfWeek[4] = "Пятница";
        daysOfWeek[5] = "Суббота";
        daysOfWeek[6] = "Воскресенье";

        System.out.printf("Последний день недели: %s", daysOfWeek[6]);
    }
}
