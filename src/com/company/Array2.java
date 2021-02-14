package com.company;

public class Array2 {
    public static void main(String[] args) {
        int k = 30;
        int l = 0;
        int myarray[] = {23, 42, 12, 123, 424, 2444};
        for ( int i = 0; i < 6; i++) {
            if (myarray[i] > k ) {
                myarray[i] = k;
                l = l + 1;
            }
            System.out.println(myarray[i]);
        }
        System.out.println(l);
    }
}