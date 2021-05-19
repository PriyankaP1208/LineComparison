package com.bridgelabz;

import java.util.Scanner;

public class LineComparator {
    public static void main(String args[])
    {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1,x2,y1,y2;
        int length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point");
        x1=sc.nextInt();

        System.out.println("enter y1 point");
        y1=sc.nextInt();

        System.out.println("enter x2point");
        x2=sc.nextInt();

        System.out.println("enter y2point");
        y2=sc.nextInt();

        length= (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of line:"+length);
    }
}
