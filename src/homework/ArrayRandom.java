package homework;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] randomNum = new int[10];

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) (Math.random() * 100);
        }

        int max = randomNum[0];
        int min = randomNum[0];

        for (int i = 1; i < randomNum.length; i++) {
            if (randomNum[i] > max) {
                max = randomNum[i];
            }
            if (randomNum[i] < min) {
                min = randomNum[i];
            }
            break;
        }
        int sum = 0;

        for (int number : randomNum) {
            sum += number;

        }

        int average = (int) sum / randomNum.length;

        System.out.printf("Максимальное значение: %d", max);
        System.out.println(" ");
        System.out.printf("Среднее значение: %d", average);
        System.out.println(" ");
        System.out.printf("Минимальное значение: %d", min);
    }
}
