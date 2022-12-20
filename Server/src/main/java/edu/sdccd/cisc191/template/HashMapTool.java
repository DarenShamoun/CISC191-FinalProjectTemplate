package edu.sdccd.cisc191.template;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.lang.System.*;

public class HashMapTool {

    public static void main(String[] args) {

        out.println("\n");
        //Using HashMapTool to modify the name and password
        HashMap<String, String> customerPasswordList = new HashMap<String, String>();
        customerPasswordList.put("Yh Shi", "PassWord$$");
        customerPasswordList.put("Bat Tom", "WhatToSet??##");
        customerPasswordList.put("Cat Bob", "ItIs@String");
        customerPasswordList.put("Daren", "NoPa$$Word");
        customerPasswordList.put("DC", "SamePa$$Word");

        out.println("\n" + customerPasswordList);

        //type the name and new password
        out.println(customerPasswordList.replace("Yh Shi", "PassWordCh@nged$$"));
        out.println("\n" + customerPasswordList);

        out.println("\n");


        // create a linked list
        // Step1: Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        // Step2: Add elements to LinkedList
        linkedList.add("#Null#");
        linkedList.add("yh Shi");
        linkedList.add("Tom Bat");
        linkedList.add("Bob Cat");
        linkedList.add("Daren");
        linkedList.add("DC");
        linkedList.add("Rock");

        System.out.print(linkedList);

        System.out.println("Type the name you need to search:");
        Scanner scanner = new Scanner(System.in);
        String nameIn = scanner.nextLine();

        //Searching first occurrence of element
        int insertTo = linkedList.indexOf(nameIn);

        System.out.println( "\n"+ nameIn+ "'s ID number is 000" + insertTo);

        System.out.println("Insert a new name in front of: "+ nameIn);
        String addName = scanner.nextLine();
        linkedList.add(insertTo,addName);
        System.out.print(linkedList);

        int newID = insertTo+1;
        System.out.println( "\n"+ addName+ "'s ID number is 000" + insertTo);
        System.out.println( "\n"+ nameIn+ "'s ID number is 000" + newID);


        //example of how to use generic for Account ( go "class genericValue" to check how the code works)
        genericValue<Integer> account = new genericValue<>(100000);
        account.print();

        genericValue<Double> doubleValue = new genericValue<>(10.11);
        doubleValue.print();

        genericValue<String> stringValue = new genericValue<>("Investor Level:999");
        stringValue.print();

        System.out.println("\n"+"\n");

        //example of lambda
        CompoundInterest();
        System.out.println("\n"+"\n");

        //example of API parallel stream
        System.out.print("We found " + ParallelTest() + " with the key word." );
        System.out.println("\n"+"\n");

        //second example of API parallel stream
        ParallelTest2();
    }

    static void CompoundInterest()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        //calculate the compound interest
        double compoundInterest = DoubleStream.iterate(principal,
                        p -> p* (1+interestRate/100)).limit(years)
                .reduce(0,(p1,p2)->p2);

        //print out the result
        System.out.println("The compound interest is: "+ compoundInterest);
    }

    //if we set the certain letter in the program, for example here, I typed the "D"
    static long ParallelTest(){
        String[]data = {"Yh Shi","Bat Tom","Cat Bob","Daren","DC"};

        //using parallel stream to count the number of strings that start with "D"
        long count =
                Arrays.stream(data)
                        .parallel()
                        .filter(s-> s.startsWith("D"))
                        .count();

        return count;
    }

    //if we allow user to input the searched letter
    static void ParallelTest2(){
        String[]data = {"Yh Shi","Bat Tom","Cat Bob","Daren","DC"};

        //create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //allow user to enter a starting letter
        System.out.println("Enter a starting letter: ");

        //read the starting letter from the user input
        String startLetter = scanner.nextLine();

        //use a parallel stream to process the array of strings and filter
        List<String> results =
                Arrays.stream(data)
                        .parallel()
                        .filter(s ->
                                s.startsWith(startLetter))
                        .collect(Collectors.toList());

        //print the results list of strings
        System.out.println("Strings starting with '" + startLetter + "': "+ results);
    }

}



