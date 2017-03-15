package com.esjay;

import java.util.Scanner;

/**
 * Created by Suvajit on 31/01/17.
 */
public class BreakDance {
    public static void main(String[] args)
    {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0;i<=s.length()-1;i++)

        {
            System.out.println(i);
                for(;i<=s.length()-1;i++)
                {
                    System.out.println(i + "hi ");
                }
            System.out.println(i);
            }
            //System.out.println(Character.isLetter(s.charAt(i)));

        /*
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isLetter(s.charAt(i))){
                counter++;
                for(;i<=s.length()-1;i++){
                    if(s.charAt(i)==' '){
                        i++;
                        break;
                    }
                    System.out.println(counter);
                }
            }
        }
        System.out.println(counter);
*/



       // System.out.println(counter);
    }

}
