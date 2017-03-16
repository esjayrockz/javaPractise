package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 15/03/17.
 */
public class InsertionSortRandomTime {
    public void check()
    {
        int arrSize = 1000;
        for(int k = 0;k < 2; k++) {
            long startTime = System.currentTimeMillis();
            int count = 0, v, j;

            Scanner scan = new Scanner(System.in);
            int n = arrSize;
            arrSize = arrSize + 500;
            int A[] = new int[n];

            for (int i = 0; i <= n - 1; i++)
                A[i] = (int)(Math.random() * 100);

            for (int i = 0; i <= n - 1; i++) {

                v = A[i];
                j = i - 1;

                while (j >= 0 && A[j] > v) {
                    count++;
                    A[j + 1] = A[j];
                    j = j - 1;
                }
                if (j >= 0)
                    count++;
                A[j + 1] = v;

            }

            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);
        }
    }
}
