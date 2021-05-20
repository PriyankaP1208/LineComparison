package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class LineComparator {
    public static void main(String args[])
    {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1,x2,y1,y2;
        int a1,a2,b1,b2;
        int length1;
        int length2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point and y1");
        x1=sc.nextInt();
        y1=sc.nextInt();

        System.out.println("enter x2point y2");
        x2=sc.nextInt();
        y2=sc.nextInt();

        System.out.println("enter a1 point a2");
        a1=sc.nextInt();
        a2=sc.nextInt();

        System.out.println("enter b1 point b2");
        b1=sc.nextInt();
        b2=sc.nextInt();

        length1= (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        length2= (int) Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
        System.out.println("Length of line:"+length1);
        System.out.println("Length of line:"+length2);
        System.out.println("Comparing" + length1 + " and " + length2 + " : " + Objects.equals(length1, length2));

    }
}
