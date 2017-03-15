

package com.esjay;
import java.util.Scanner;
/**
 * Created by Suvajit on 15/02/17.
 */
public class StringPermutations {

    public void checkPermutation() {
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        char[] cArr = s.toCharArray();

        permute(cArr,0,cArr.length-1);

    }

    public void permute(char[] cArr,int i,int n)
    {
        if(i==n) {
            for (char k: cArr)
                System.out.print(k);
                System.out.print("\n");
        }
        else {
            for (int j = i; j <= n; j++) {
                swap(cArr,i,j);
                permute(cArr,i+1,n);
                swap(cArr,i,j);
            }
        }
    }

    public void swap(char[] arr,int i, int j)
    {
        char temp;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }

}
