package com.bridgelabz;

import java.util.Scanner;

public class LineComparator {
    Line line = new Line();

    public void lineCompare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 Coordinate");
        line.startXPoint = sc.nextInt();
        System.out.println("Enter x2 Coordinate");
        line.endXPoint = sc.nextInt();
        System.out.println("Enter Y1 Coordinate");
        line.startYPoint = sc.nextInt();
        System.out.println("Enter Y2 Coordinate");
        line.endYPoint = sc.nextInt();
    }

    //Calculating length of line
    public double lengthCalculator() {
        return Math.sqrt((line.endXPoint - line.startXPoint) * (line.endXPoint - line.startXPoint)
                + (line.endYPoint - line.startYPoint) * (line.endYPoint - line.startYPoint));
    }
}
