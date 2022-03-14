package com.infogalaxy;

import java.util.Scanner;

public class LineComparisonProblem {

    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison problem");
        Scanner scanner = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        double length;
        System.out.println("Enter the Co-ordinates for starting point:");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates for ending point: ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        System.out.println("x1 : "+x1+"\ny1 : "+y1+"\nx2 : "+x2+"\ny2 : "+y2);
        length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Lenth of The Line : "+length);
    }

}
