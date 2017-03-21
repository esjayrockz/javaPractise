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

        int age = 5;
        int a = (age>4?1:6);
        System.out.println(a);

    }
}
