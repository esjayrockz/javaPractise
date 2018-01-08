package com.esjay;
import java.util.Scanner;

/**
 * Created by Suvajit on 07/07/17.
 */
public class CodefightsSequence {
    public static void main(String[] args)
    {
        boolean b = almostIncreasingSequence();
        System.out.println(b);
    }
   public static boolean almostIncreasingSequence() {
        Scanner sc = new Scanner(System.in);
        int[] sequence = new int[4];
        System.out.println("Enter array values");
        for(int i=0;i<4;i++)
            sequence[i]= sc.nextInt();
       int x,j,flag=0;
       for(int i=1;i<sequence.length;i++)
       {
           if(flag==2)
               break;
           x = sequence[i];
           j=i-1;
           while(j>=0 && sequence[j]>=x)
           {
               sequence[j+1]=sequence[j];
               j--;
               if(flag>0)
                   flag=2;
               else
                   flag=1;
               System.out.println(flag);
           }
           sequence[j+1]=x;
       }
       if(flag==0 || flag==1)
           return true;
       else
           return false;
    }


}
