package com.company;

public class Array13 {
    public static void main(String[] args) {
        int[][] myarray = new int[][]{{2, 10, 4},
                {4, 5, 6},
                {7, 8, 19}};
        int k = 0;
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                if (myarray[i][j] > k) {
                    k = myarray[i][j];
                }
            }
        }
        int m = 0;
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                m = myarray[i][j] % 2;
                if (m != 0) {
                    myarray[i][j] = k;

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