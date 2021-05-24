package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class LineComparator {
    public static void LineCompare(){
        int x1,x2,y1,y2;
        int a1,a2,b1,b2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter x2 y2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Enter a1 b1");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        System.out.println("Enter x2 y2");
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        Double length1;
        double length2;
        length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        length2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));
        boolean lengthCheck = length1.equals(length2);
        System.out.println("Comparing" + length1 + " and " + length2 + " : " + lengthCheck);

        if (lengthCheck)
        {
            System.out.println("Lines are equals");
        }
        else if (length1>length2)
        {
            System.out.println("Line xy is greater than ab");
        }
        else if (length1<length2){
            System.out.println("Line xy is smaller than ab");
        }
        else
        {
            System.out.println("Lines are not equals");
        }
    }
    public static void main(String args[]) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineCompare();
    }
}
