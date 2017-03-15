package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 10/08/16.
 */
public class ThrowMe {

    public static void main(String[] args)
    {
        int a ;
        System.out.println("Hello");
        ThrowMe obj = new ThrowMe();

        try{

           obj.someThingElse();

        }
        catch(Exception e)
        {
            System.out.println("The error is "+e);

        }

        System.out.println("Hello again");


    }

    public void someThingElse() throws ArithmeticException
    {
        int a,t ;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        a = 4/t;
        if (t == -1)
            throw new ArithmeticException();

    }

}
