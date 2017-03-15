package com.esjay;

/**
 * Created by Suvajit on 01/08/16.
 */
public class InheritConstruct {

    public static void main(String[] args)
    {
        System.out.println("hello");
        InheritConstructer ic = new InheritConstructer();
        ic.ran();
    }

    public InheritConstruct()
    {

    }

    private InheritConstruct(int i)
    {

    }

}

 class InheritConstructer extends InheritConstruct {

    public void ran()
    {

        System.out.println("hello ic");


    }

     /* public InheritConstructer(int i)
     {
        super();
     } */

}