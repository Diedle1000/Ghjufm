package com.company;

public class Array6 {
    public static void main(String[] args) {
        int myarray[][] = {{1, 2, 3, 5, 6, 13},
                           {4, 5, 6, 4, 4, 32},
                           {7, 8, 9, 3, 1, 4}};
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                if ((j % 2 != 0) & (myarray[0][j] > myarray[myarray.length - 1][j])) {
                    System.out.print(myarray[i][j] + " ");
                }
            }
            System.out.println();

        }
    }
}

