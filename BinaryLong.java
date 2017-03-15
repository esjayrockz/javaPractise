package com.esjay;
import java.util.Scanner;
/**
 * Created by Suvajit on 24/07/16.
 */
public class BinaryLong {

    public static void main(String[] args) {
        long k,  i = 1, max = 0,c=0;
        long b = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        do {
            k = n % 2;
            b = b + (k * i);
            i = i * 10;
            n = n / 2;
        }
        while (n != 0);

        System.out.println(b);

        do {

            if (b % 10 == 1)
                c = c + 1;
            else
                c = 0;

            b = b / 10;
            if (c>max)
                max = c;
        }
        while (b != 0);

        System.out.println(max);

    }
}
