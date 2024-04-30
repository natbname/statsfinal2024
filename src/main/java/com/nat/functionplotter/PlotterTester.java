package com.nat.functionplotter;

import java.util.Scanner;

public class PlotterTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The function is y = x^3 - 4x. Please set the range for x.");
        System.out.println("First x value: ");
        double x1 = input.nextDouble();
        System.out.println("Last x value: ");
        double x2 = input.nextDouble();
        System.out.println("Please set the intervals for x: ");
        double inter = input.nextDouble();
        
        FunctionPlotter test = new FunctionPlotter(x1,x2,inter);
        test.result();
    }
}
