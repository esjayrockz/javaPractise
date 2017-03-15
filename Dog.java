package com.esjay;

/**
 * Created by Suvajit on 31/07/16.
 */
public class Dog {

    String name;

    public Dog(String name){

        this.name = name;

    }

    public static void main(String[] args)
    {
        Dog aDog = new Dog("Max");
        foo(aDog);

        if (aDog.getName().equals("Max"))
        { //true
            System.out.println( "Java passes by value." );

        }
        else if (aDog.getName().equals("Fifi")) {
            System.out.println( "Java passes by reference." );
        }

        System.out.println(aDog.getName() + " aDog");
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true

        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true

        d.setName("Fifi");
        System.out.println(d.getName() + " d");
        
    }


    public void setName(String s)
    {
        name = s;

    }

    public String getName()
    {
        //this.name = name;
        return name;

    }
}
