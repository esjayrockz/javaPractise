package com.esjay;

import java.io.*;
import java.util.*;

/**
 * Created by Suvajit on 18/08/16.
 */
public class Palindrome {

    Stack<Character> myStack = new Stack<Character>();
    Queue<Character> q = new LinkedList<Character>();

    void pushCharacter(Character c)
    {
        myStack.push(c);
    }

    void enqueueCharacter(Character c)
    {
        q.add(c);
    }

    Character popCharacter()
    {
        return myStack.pop();
    }

    Character dequeueCharacter()
    {
        return q.remove();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Palindrome p = new Palindrome();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
