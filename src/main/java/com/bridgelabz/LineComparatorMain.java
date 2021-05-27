package com.bridgelabz;

public class LineComparatorMain {
    public static void main(String args[]){
        LineComparator lineComparator = new LineComparator();
        lineComparator.lineCompare();
        Double length1 = lineComparator.lengthCalculator();
        System.out.println(length1);
        lineComparator.lineCompare();
        Double length2 = lineComparator.lengthCalculator();
        System.out.println(length2);

        //Comparing two lines
        int result = length1.compareTo(length2);
        switch (result)
        {
            case 0:
                System.out.println("Lines are equal");
                break;
            case 1:
                System.out.println("Line1 is greater than line2");
                break;
            case -1:
                System.out.println("Line1 is less than line2");
                break;
        }
    }
}
