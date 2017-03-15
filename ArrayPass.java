package com.esjay;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Suvajit on 02/08/16.
 */
 class Difference {

    private int[] elements;
    public int maximumDifference;
    public Difference(int a[])
    {
        elements = a;
        //Arrays.sort(elements);
        //System.out.println(elements[2]);
    }


    public void computeDifference()
    {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];

    }

}
public class ArrayPass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

       difference.computeDifference();

      System.out.print(difference.maximumDifference);
    }
}