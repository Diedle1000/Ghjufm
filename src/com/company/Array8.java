package com.company;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка");
        int m = scanner.nextInt();
        System.out.println("Столбец");
        int n = scanner.nextInt();
        int myarray[][] = {{1, 2, 3,4},
                           {4, 5, 6},
                           {7, 8, 9}};
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                if (i == m) {
                    System.out.print(myarray[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                if (j == n) {
                    System.out.println(myarray[i][j]);
                }
            }
        }
    }
}
