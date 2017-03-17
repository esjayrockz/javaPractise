package com.esjay;

import java.util.Scanner;


public class Start {

    public static void main(String[] args) {

	// write your code here
        System.out.println("Hello tryouts");


        Scanner sc = new Scanner(System.in);
        System.out.println("Say something");
        String say = sc.nextLine();
        System.out.println(say);

        int age = 7, age2 = 18;
        if(age==7 && age2==18)
            System.out.println("Age difference is ok");
        System.out.print(!false);

    }
}
