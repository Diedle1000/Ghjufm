package com.company;

public class Array12 {
    public static void main(String[] args) {
        int k = 0;
        int[][] marry = new int[][]{{1, 2, 3, 4, 2, 3, 4, 5, 2, 5, 4, 1, 5, 3, 1, 5, 3, 1, 2, 3},
                {4, 5, 2, 4, 2, 3, 4, 5, 2, 4, 4, 1, 0, 3, 1, 2, 3, 1, 2, 3},
                {1, 3, 2, 4, 2, 3, 4, 3, 2, 1, 4, 1, 4, 3, 1, 5, 3, 1, 2, 3}};
        for (int i = 0; i < marry.length; i++) {
            for (int j = 0; j < marry[i].length; j++) {
                System.out.print(marry[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = 0; i < marry.length; i++) {
            for (int j = 0; j < marry[i].length; j++) {
                if (marry[i][j] == 5) {
                    k = k + 1;
                }
            }
            if (k >= 3) {
                System.out.println(i);
            }
            k = 0;
        }
    }
}