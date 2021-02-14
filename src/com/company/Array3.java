package com.company;

public class Array3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int zero = 0;
        int myarray[] = {0, 12, 323, -23, -23, 331, 665};
        for ( int i = 0; i < 7; i++){
            if (myarray[i] > 0) {
                max = max + 1;
            } if ( myarray[i] < 0 ) {
                min = min + 1;
            } if (myarray[i] == 0) {
                zero = zero + 1;
            }
        }
        System.out.println("отрицательных" + min + "положительных" + max + "нулей" + zero);
    }
}
