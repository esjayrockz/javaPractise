package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 22/02/17.
 */
public class InsertionSort {

    public void sort()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to sort");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the numbers");
        for(int i =0; i<n;i++)
        a[i] = sc.nextInt();

        int temp;

        for(int i=1;i<n;i++)
        {
            temp = a[i];
            int j=i-1;
            //System.out.println(a[j]);
            while(j>=0 && a[j]>temp)
            {
                a[j+1]= a[j];
                j--;

            }
            a[j+1]=temp;
        }
        for(int  i=0;i<n;i++)
            System.out.print(a[i]+" ");



    }
}
