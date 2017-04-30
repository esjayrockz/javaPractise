package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 05/04/17.
 */
public class SortedMatrixSearch {
    public static void main(String[] args)
    {   int pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        System.out.println("Enter the values of a matrix in a sorted manner");
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the value you want to search for");
        int k = sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(k >= mat[i][0] && k <= mat[i][n-1])
            {
                pos = binarySearch(i,n,k,mat);
                if (pos == -1)
                    System.out.println("Value not found");
                else
                    System.out.println("Value found in row "+(i+1)+" column "+ (pos+1));
                flag++;
                break;


            }

        }
        if(flag == 0)
            System.out.println("Value not found");

    }

    public static int binarySearch(int i,int n,int k, int mat[][])
    {
        int max = n-1, min = 0;
        int mid;
  while(min<=max)
  {
        mid = (min + max)/2;
      if (k == mat[i][mid])
          return mid;
      else if (k>mat[i][mid])
          min = mid +1;
      else
          max = min -1;
  }
  return -1;


    }
}
