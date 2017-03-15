package com.esjay;

/**
 * Created by Suvajit on 12/02/17.
 */
public class AdjacentString {

    String str;

    public AdjacentString(String s)
    {
        str = s;

    }

    public void checkAverage()
    {
        int c = 0;
        //int copy = Integer.parseInt(str);

        char[] A = str.toCharArray();
        int len = str.length();

        int tot = fact(len)/(2*fact(len-2));
        int[] arr2 = new int[tot];


        int x = 0;
        for(int i =0; i<len-1; i++)
        {
            for(int j = i+1; j<len; j++)

            {
                arr2[x] = Character.getNumericValue(A[i])+ Character.getNumericValue(A[j]);
                x++;

            }

        }
        //System.out.println(arr2[1]);
    double avg = 0,sum = 0;
    for(int k =0; k<tot; k++)
    {
        sum = sum + arr2[k];

    }
    avg = sum/tot;
    System.out.println("The average is "+avg);

    }

    public int fact(int n)
    {
        if(n == 0 || n == 1)
                return 1;
            else
                return n * fact(n-1);
        /*int f =1 ;
        for(int i = 1 ; i<=n;i++)
        f = f * i;

        return f;
        */
    }
}
