package com.company;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Столбец 1");
        int m = scanner.nextInt();
        System.out.println("Столбец 2");
        int n = scanner.nextInt();
        int t = 0;
        int k = 0;
        int myarray[][] = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        for ( int i = 0; i < myarray.length; i++) {
            t = myarray[i][m];
            k = myarray[i][n];
            myarray[i][m] = k;
            myarray [i][n] = t;
            for ( int j = 0; j < myarray[i].length; j++) {
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
            }
        }
    }
