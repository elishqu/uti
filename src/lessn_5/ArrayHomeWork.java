package lessn_5;

public class ArrayHomeWork {

    // массив - набор однотипных объектов
    // двумерный массив - массив массивов

    // создать 4 одномерных массива любого типа (минимальная размерность: 3)
    // создать 2 двумерных массива, запихнуть туда одномерные
    // создать 1 трехмерный массив, запихнуть туда двумерные
    // выведи на консоль все элементы 3 мерных массива через обращения к индексам, шаблон вывода: [x, y, z]
    // не используем классы

    public static void main(String[] args) {
        // переменные
        int c = 1,
            a = 2,
            s = 3;

        int d = 4,
            j = 5,
            t = 6;

        double h = 7.7,
               u = 8.8,
               i = 9.9;

        double z = 10.11,
               o = 11.11,
               v = 12.12;

        // 4 одномерных массива

        int[]intLitters = new int[3];
        intLitters[0] = c;
        intLitters[1] = a;
        intLitters[2] = s;

        int[]int2Litters = new int[3];
        int2Litters[0] = d;
        int2Litters[1] = j;
        int2Litters[2] = t;

        double[]double2Litters = new double[3];
        double2Litters[0] = h;
        double2Litters[1] = u;
        double2Litters[2] = i;

        double[]doubleLitters = new double[3];
        doubleLitters[0] = z;
        doubleLitters[1] = o;
        doubleLitters[2] = v;

        // два двумерных массива

        int[][]intArrayTwo = new int[6][6];
        intArrayTwo[0][0] = intLitters[0];
        intArrayTwo[1][1] = intLitters[1];
        intArrayTwo[2][2] = intLitters[2];
        intArrayTwo[3][3] =  int2Litters[0];
        intArrayTwo[4][4] = int2Litters[1];
        intArrayTwo[5][5] =  int2Litters[2];


        double[][]doubleArrayTwo = new double[6][6];
        doubleArrayTwo[0][0] =  doubleLitters[0];
        doubleArrayTwo[1][1] =  doubleLitters[1];
        doubleArrayTwo[2][2] = double2Litters[2];
        doubleArrayTwo[3][3] =  double2Litters[0];
        doubleArrayTwo[4][4] = double2Litters[1];
        doubleArrayTwo[5][5] =  double2Litters[2];

        // два трехмерный

        int[][][]intArrayThree = new int[6][6][6];
        intArrayThree[0][0][0] =  intArrayTwo[0][0];
        intArrayThree[1][1][1] = intArrayTwo[1][1];
        intArrayThree[2][2][2] = intArrayTwo[2][2];
        intArrayThree[3][3][3] =   intArrayTwo[3][3];
        intArrayThree[4][4][4] = intArrayTwo[4][4];
        intArrayThree[5][5][5] =  intArrayTwo[5][5];

        double[][][]doubleArrayThree = new double[6][6][6];
        doubleArrayThree[0][0][0] =  doubleArrayTwo[0][0];
        doubleArrayThree[1][1][1] = doubleArrayTwo[1][1];
        doubleArrayThree[2][2][2] = doubleArrayTwo[2][2];
        doubleArrayThree[4][4][4] = doubleArrayTwo[4][4];
        doubleArrayThree[5][5][5] =  doubleArrayTwo[5][5];

    // вывод трехмерного массива int

        System.out.println("start");

        System.out.print("[");
        System.out.print(intArrayThree[0][0][0]);
        System.out.print(",");
        System.out.print(intArrayThree[1][1][1]);
        System.out.print(",");
        System.out.print(intArrayThree[2][2][2]);
        System.out.print(",");
        System.out.print(intArrayThree[3][3][3]);
        System.out.print(",");
        System.out.print(intArrayThree[4][4][4]);
        System.out.print(",");
        System.out.print(intArrayThree[5][5][5]);
        System.out.print("]");

        System.out.println(" ");
        System.out.println("end");

    // вывод трехмерного массива double

        System.out.println("start");

        System.out.print("[");
        System.out.print(doubleArrayThree[0][0][0]);
        System.out.print(",");
        System.out.print(doubleArrayThree[1][1][1]);
        System.out.print(",");
        System.out.print(doubleArrayThree[2][2][2]);
        System.out.print(",");
        System.out.print(doubleArrayThree[4][4][4]);
        System.out.print(",");
        System.out.print(doubleArrayThree[5][5][5]);
        System.out.print("]");

        System.out.println(" ");
        System.out.println("end");
    }
}


 
