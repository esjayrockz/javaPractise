package com.esjay;

import java.util.*;

/**
 * Created by Suvajit on 04/08/16.
 */
public class Node {

    int data;
    Node next;


    //SuperClass obj = new Class();


    Node(int d)
    {
        data = d;
        next = null;

    }

}
class Solution {

    static Node last = null;
    public static Node insert(Node head, int data) {
        //Complete this method

        Node n = new Node(data);

        if (head == null) {
            head = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }


        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

}



