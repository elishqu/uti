package lessn_6;

public class Cycles {
    public static void main(String[] args) {


        int[] ints = {
            1, 2, 3,
            4, 5, 6
        };


        // двумерные массивы

        int[][] oneArray = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] twoArray = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] threeArray = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] fourArray = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // трехмерные массивы

        int[][][] threeOneArray = {
            oneArray, twoArray
        };

        int[][][] threeTwoArray = {
            threeArray, fourArray
        };

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("-------");

        for (int i = 0; i < oneArray.length; i++) {
            for (int j = 0; j < oneArray[i].length; j++) {
                System.out.println(oneArray[i][j]);
            }
        }

        System.out.println("-------");

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.println(twoArray[i][j]);
            }
        }

        System.out.println("-------");

        for (int[] i : threeArray) {
            for (int j : i) {
                System.out.println(j);
            }
        }

        System.out.println("-------");

        int pidor = 0;

        while (pidor < fourArray.length) {
            int homo = 0;
            while (homo < fourArray[pidor].length) {
                System.out.println(fourArray[pidor][homo]);
                homo++;
            }
            pidor++;
        }

        System.out.println("-------");

        for (int i = 0; i<threeOneArray.length; i++) {
            for(int j = 0; j<threeOneArray[i].length; j++) {
                for (int k = 0; k<threeOneArray[i][j].length; k++) {
                    System.out.println(threeOneArray[i][j][k]);
                }
            }
        }

        System.out.println("-------");

        for (int[][] i : threeOneArray) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.println(k);
                }
            }
        }

        System.out.println("-------");

        int i = 0;

        while (i < threeOneArray.length) {
            int j = 0;
            while (j < threeOneArray[i].length) {
                int k = 0;
                while (k < threeOneArray[i][j].length) {
                    System.out.println(threeOneArray[i][j][k]);
                    k++;
                }
                j++;
            }
            i++;
        }

        System.out.println("-------");

        for (int j = 0; j<threeTwoArray.length; j++) {
            for (int k = 0; k<threeTwoArray[j].length; k++) {
                for (int l = 0; l<threeTwoArray[j][k].length; l++) {
                    System.out.println(threeTwoArray[j][k][l]);
                }
            }
        }

        System.out.println("-------");

        for (int[][] j : threeTwoArray) {
            for (int[] k : j) {
                for (int l : k) {
                    System.out.println(l);
                }
            }
        }

        System.out.println("-------");

        int j = 0;

        while (j < threeTwoArray.length) {
            int k = 0;
            while (k < threeOneArray[j].length) {
                int l = 0;
                while (l < threeTwoArray[j][k].length) {
                    System.out.println(threeTwoArray[j][k][l]);
                    l++;
                }
                k++;
            }
            j++;
        }
    }
}







































