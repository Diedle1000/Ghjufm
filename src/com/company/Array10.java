package com.company;

public class Array10 {
    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        int z = 0;
        int myarray[][] = {{112, 10, 4},
                           {4, 5, 6},
                           {7, 8, 9}};
        for ( int i = 0; i < myarray.length; i++) {
            for ( int j = 0; j < myarray[i].length; j++) {
                k = k + myarray[j][i];

            }
            System.out.println(k);
            if (k > m) {
                m = k;
                z = i;
            }
            k = 0;
        }
        System.out.println(z);
    }
}
