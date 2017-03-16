package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 15/03/17.
 */
public class InsertionSortComparisons {
    public void check()
    {
        int count = 0,v,j;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = scan.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the numbers");
        for(int i = 0;i<=n-1;i++)
        A[i] = scan.nextInt();


        for(int i =0;i<=n-1;i++){

            v = A[i];
            j = i-1;

            while(j>=0 && A[j]>v)
            {
                count++;
                A[j+1] = A[j];
                j = j-1;
            }
            if(j>=0)
                count++;
            A[j+1] = v;

        }
        System.out.println(count);
    }
}
