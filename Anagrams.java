package com.esjay;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Suvajit on 14/08/16.
 */
public class Anagrams {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a = sc.nextLine();
        System.out.println("Enter the second string");
        String b = sc.nextLine();
        a = a.replaceAll("\\s","");
        b = b.replaceAll("\\s","");
        char[] str1 = a.toLowerCase().toCharArray();
        char[] str2 = b.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1,str2))
            System.out.println("They are anagrams");
        else
            System.out.println("They are not anagrams");

    }
}
