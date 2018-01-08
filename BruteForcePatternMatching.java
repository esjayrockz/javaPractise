package com.esjay;
import java.util.Scanner;
/**
 * Created by Suvajit on 03/05/17.
 */
public class BruteForcePatternMatching {

    public static void main(String[] args)
    {
        String a = "0";
        for(int i = 0;i<999;i++)
            a = a + "0";
            count(a);
    }

    public static void count(String text){
        Scanner scan = new Scanner(System.in);
        String pattern = scan.nextLine();
        int c =0, start;
        for(int i = 0;i < text.length() - pattern.length() + 1;i++)
        {
            start = i;
            for(int j = 0;j < pattern.length();j++)
            {
                if(text.charAt(start) != pattern.charAt(j))
                {
                    break;

                }
                c++;
                start++;
            }
            c++;
        }
        System.out.println("Count of successful and unsuccessful comparisons = "+ c);

    }

    }

