package com.company;

public class Array11 {
    public static void main(String[] args) {
        int[][] marry = new int[][] {{1, 2, 3},
                {4, -5, 6},
                {7, 8, 9}};
        for (int i = 0; i < marry.length; i++) {
            for (int j = 0; j < marry[i].length; j++) {
                if (j == i) {
                    if (marry[i][j] >= 0) {
                        System.out.print(marry[i][j] + " ");
                    }
                }
            }
        }
    }
}

