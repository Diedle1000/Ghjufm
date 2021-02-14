package com.company;

public class Array4 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int myarray[] = {42, 12, 323, 23, -2, 331, 665};
      for (int i = 0; i < 7; i++ ) {
          if (myarray[i] < min) {
              min = myarray[i] ;
          }
          if (myarray[i] > max) {
              max = myarray[i];
          }
      }
        for (int i = 0; i < 7; i++ ) {
            if (myarray[i] == max) {
                myarray[i] = min;
            } else {
                if (myarray[i] == min) {
                    myarray[i] = max;
                }
            }
            System.out.print(myarray[i] + " ");
        }
        //System.out.println(min + "  " + max);
    }
}
