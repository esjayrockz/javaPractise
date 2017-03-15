package com.esjay;
import java.util.*;
/**
 * Created by Suvajit on 06/02/17.
 */
public class NextLineChecker {

    public void check()
    {

       // int s ; String a = " ";
      //  Scanner sc = new Scanner(System.in);
/*
        String i = "Hmm";
        //double d = 4.0;
        String s = "HackerRank ";
*/
        Scanner scan = new Scanner(System.in);

       // int i2 = scan.nextInt();
       // double d2 = scan.nextDouble();
        //scan.next();
        int i = scan.nextInt();
        //scan.next();
        scan.nextLine();
        String s = scan.nextLine();

       // System.out.println(i+i2);
      //  System.out.println(d+d2);
        System.out.println(i+s);

    }

}
