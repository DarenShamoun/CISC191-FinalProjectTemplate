package edu.sdccd.cisc191.template;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class CompoundInterest
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        //calculate the compound interest using a parallel stream
        double compoundInterest = DoubleStream.iterate(principal,
                        p -> p* (1+interestRate/100)).limit(years)
                .reduce(0,(p1,p2)->p2);

        //print out the result
        System.out.println("The compound interest is: "+ compoundInterest);

    }

}