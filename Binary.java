package com.esjay;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Suvajit on 24/07/16.
 */
public class Binary {


    public static void main(String[] args) {

        long k,  i = 1, max = 0,c=0;

        BigInteger b = BigInteger.valueOf(0);;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        do {
            k = n % 2;
            b = b.add(BigInteger.valueOf(k * i)) ;
            i = i*10;
            n = n/2;
        }
        while(n!=0);

        System.out.println(b);



        do{
            if(b.mod(BigInteger.TEN).equals(BigInteger.ONE))
                c = c + 1;
            else
                c = 0;

            b=b.divide(BigInteger.valueOf(10));
            if (c>max)
                max = c;
        }
        while(!b.equals(BigInteger.ZERO));


        System.out.println(max);


    }




}