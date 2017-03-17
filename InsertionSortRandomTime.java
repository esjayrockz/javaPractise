package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 15/03/17.
 */
public class InsertionSortRandomTime {
    public void check()
    {
        int arrSize = 1000;
        for(int k = 0;k < 20; k++) {
            long startTime = System.currentTimeMillis();
            int  v, j;

            Scanner scan = new Scanner(System.in);
            int n = arrSize;
            arrSize = arrSize + 500;
            int A[] = new int[n];

            for (int x = 0; x <= n - 1; x++)
                A[x] = (int)(Math.random() * 100);

            for (int i = 1; i <= n - 1; i++) {

                v = A[i];
                j = i - 1;

                while (j >= 0 && A[j] > v) {

                    A[j + 1] = A[j];
                    j = j - 1;
                }

                A[j + 1] = v;

            }

            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);
        }
    }
}
