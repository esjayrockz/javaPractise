package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 21/08/16.
 */
public class SB {


        public static void main(String[] args)
        {
            String c,d="    ",e; int f;
            StringBuffer s = new StringBuffer();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first string");
            String a = sc.nextLine();
            System.out.println("Enter the second string");
            String b = sc.nextLine();
            c = a+b;

            for(int i =c.length();i>0;i--)
                s.append(c.charAt(i-1));
            //d = d + c.charAt(i-1);
            //System.out.println(d);
            f = 'a' + 'b';
            System.out.println(d);

        }
    }


