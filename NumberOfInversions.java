package com.esjay;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Suvajit on 11/04/17.
 */
public class NumberOfInversions {
    public void check()
    {
        int count = 0, v, j;
        int n = 20;
           int[] A = UniqueRandomNumbers();

            for (int i = 1; i <= n - 1; i++) {

                v = A[i];
                j = i - 1;

                while (j >= 0 && A[j] > v) {
                    count++;
                    A[j + 1] = A[j];
                    j = j - 1;
                }

                A[j + 1] = v;

            }
        System.out.print("Random array elements: ");
        for (int x = 0; x <= n - 1; x++)
            System.out.print(A[x]+"  ");
            System.out.println();
            System.out.println("Number of Inversions: "+count);

    }

    public int[] UniqueRandomNumbers() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] A = new int[20];
        for (int i=1; i<1001; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<20; i++) {
             A[i] = list.get(i);
        }
        return A;
    }

}
