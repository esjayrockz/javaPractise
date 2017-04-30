package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 12/04/17.
 */
public class ConnectedGraphAdjacencyMatrix {
    public static void main(String[] args)
    {
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

       if(connectedGraph(mat,n)==1)
        System.out.println("The graph is connected");
        else
        System.out.println("The graph is not connected");
    }

    public static int connectedGraph(int A[][],int n)
    {

    if(n==1)
        return 1;
    else
    if(connectedGraph(A,n-1)==0)
        return 0;
    else {
        for (int j = 0; j <= n ; j++) {
            if (A[n - 1][j] == 1)
                return 1;
        }

    }
        return 0;
    }




}
