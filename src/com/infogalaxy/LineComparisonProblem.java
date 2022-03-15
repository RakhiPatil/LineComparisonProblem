package com.infogalaxy;

import java.util.Scanner;

public class LineComparisonProblem {
    public static String equals(double length, double length2){
        if(length == length2){
           return "Lines are of Equal length";
        }else{
            return  "Lines are Unequal in Length";
        }
    }

    public static void main(String[] args) {
        //UC-1
        System.out.println("Welcome to line Comparison problem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates for starting point:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates for ending point: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("x1 : "+x1+"\ny1 : "+y1+"\nx2 : "+x2+"\ny2 : "+y2);
        double length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Length of The First Line : "+length);

        //UC-2
        System.out.println("Enter the Co-ordinates for starting point:");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates for ending point: ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        System.out.println("a1 : "+a1+"\nb1 : "+b1+"\na2 : "+a2+"\nb2 : "+b2);
        double length2 = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
        System.out.println("Length of The Second Line : "+length2);

        System.out.println(equals(length,length2));

    }
}
