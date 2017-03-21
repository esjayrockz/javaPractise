package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 19/03/17.
 */
public class InsertionSortRandomTime2 {

    public void check()
    {
        int arrSize = 9500;long startTime;

            startTime = System.currentTimeMillis();
            int  v, j;

            Scanner scan = new Scanner(System.in);
            int n = arrSize;
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

            System.out.println(arrSize + " " + (System.currentTimeMillis() - startTime));
            //arrSize = arrSize + 500;

    }

}
