package com.company;

public class Array5 {
    public static void main(String[] args) {
        int m = 0;
        int myarray[] = {42, 12, 331, 42, -2, 331, 665};
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (myarray[i] == myarray[j]) {
                    m = myarray[i];
                }
            }
        }
        System.out.println(m);
    }
}
