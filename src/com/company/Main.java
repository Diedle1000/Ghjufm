package com.company;

public class Main {

    public static void main(String[] args) {
        int myarray[] = {23, 42, 12, 123, 424, 2444};
        int k = 3;
        for (int i = 0; i < 6; i++) {
            if (myarray[i] % k == 0) System.out.println(myarray[i]);
        }

    }
}
