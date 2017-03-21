package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 15/03/17.
 */
public class InsertionSortRandomTime {
    public void check()
    {
        int arrSize = 1000;long startTime;
        for(int k = 0;k < 20; k++) {

            int  v, j;

            Scanner scan = new Scanner(System.in);
            int n = arrSize;
            int A[] = new int[n];

            for (int x = 0; x <= n - 1; x++)
                A[x] = (int)(Math.random() * 100000);

            startTime = System.currentTimeMillis();

            for (int i = 1; i <= n - 1; i++) {

                v = A[i];
                j = i - 1;

                while (j >= 0 && A[j] > v) {

                    A[j + 1] = A[j];
                    j = j - 1;
                }

                A[j + 1] = v;

            }

            System.out.println("Size = "+ arrSize + ", Time = " + (System.currentTimeMillis() - startTime));
            System.out.println("fINE");
            arrSize = arrSize + 500;
        }
    }
}
