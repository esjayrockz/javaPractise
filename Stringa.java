package com.esjay;

/**
 * Created by Suvajit on 01/08/16.
 */
public class Stringa {

    public static void main(String[] args)
    {
        String a = "abcd";
        String b = "abcd";
        String c = b;
        String f = new String("abcd");
        System.out.println(a==b);
        System.out.println(a==c);
        String d = f.intern();
        String e = d.intern();
        System.out.println(d);
        System.out.println(e);
        System.out.println(f==d);
        System.out.println(d==e);
        System.out.println(f==e);
        System.out.println(a==f);


    }


}
