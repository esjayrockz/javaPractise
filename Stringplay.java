package com.esjay;
import java.io.*;
import java.util.*;

/**
 * Created by Suvajit on 31/01/17.
 */
 class Stringplay {




    public static void main(String[] args)
    {



        try {

            System.out.println("Enter a string");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();


            int counter=0;
            for(int i=0;i<=s.length()-1;i++){
                if(Character.isLetter(s.charAt(i))){
                    counter++;
                    for(;i<=s.length()-1;i++){
                   //   System.out.println(s.charAt(i));
                        if(s.charAt(i)==' '){
                          //  i++;
                            break;
                        }
                    }
                }
            }
                System.out.println(counter);



            /* if(s.contains("Hello"))
                System.out.println("Do the dance"); */
                //System.out.println(s.substring(2, 1));
            //s = s.replaceAll("\\s+","");
            //System.out.print(s);
            //System.out.println("ok");
            //System.out.println(s.split("\\s").length);

        //s = s.replaceAll("\\s","");
           // System.out.println( s.trim().replaceAll("\\s+"," ").split(" ").length);
         /* s = s.trim();
          String[] s1 =  s.split("\\s+");
            for(int k =0;k<s1.length;k++)
            System.out.println(s1[k]);
        int words = s.isEmpty() ? 0 : s.split("\\s+").length;
        System.out.println(words);

        /*

        for(int i = s.length();i>0;i--)
            s1 += s.charAt(i-1);
        System.out.println("The reversed string is "+s1);
        */
        }
        catch(Exception e)
        {
            System.out.println("Thats alright. Its just an error "+e);


        }


    }

}
