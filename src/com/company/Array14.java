package com.company;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        int[][] myarray = new int[][]{{2, 10, 4},
                {7, 5, 6},
                {7, 8, 19}};
        System.out.println("1 - По возростанию" + " " + "2 - По убыванию");
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        if (z == 1) {
            for (int i = 0; i < myarray.length; i++) {
                for (int j = 0; j < myarray[i].length; j++) {
                    int min = myarray[i][j];
                    int min_j = j;
                    for (int k = j + 1; k < myarray[i].length; k++) {
                        if (myarray[i][k] < min) {
                            min = myarray[i][k];
                            min_j = k;
                        }
                    }
                    if (j != min_j) {
                        int t = myarray[i][j];
                        myarray[i][j] = myarray[i][min_j];
                        myarray[i][min_j] = t;
                    }
                }
            }
            for (int i = 0; i < myarray.length; i++) {
                for (int j = 0; j < myarray[i].length; j++) {
                    System.out.print(myarray[i][j] + " ");
                }
                System.out.println();
            }
        }
            if (z == 2) {
                for (int i = 0; i < myarray.length; i++) {
                    for (int j = 0; j < myarray[i].length; j++) {
                        int max = myarray[i][j];
                        int max_j = j;
                        for (int k = j + 1; k < myarray[i].length; k++) {
                            if (myarray[i][k] > max) {
                                max = myarray[i][k];
                                max_j = k;
                            }
                        }
                        if (j != max_j) {
                            int t = myarray[i][j];
                            myarray[i][j] = myarray[i][max_j];
                            myarray[i][max_j] = t;
                        }
                    }
                }
                for (int i = 0; i < myarray.length; i++) {
                    for (int j = 0; j < myarray[i].length; j++) {
                        System.out.print(myarray[i][j] + " ");
                    }
                    System.out.println();
                }
            }
    }
}

