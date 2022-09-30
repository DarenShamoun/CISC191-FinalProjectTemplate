package edu.sdccd.cisc191.template;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private static ArrayList<Double> list = new ArrayList<>();

    // method to subtract 100 from account balance
    public static double subHundred(double balance) {

        balance += UnusedBackend.preBuiltOptions[1][0];
        return balance;
    }

    // method to subtract 1000 from account balance
    public static double subThousand(double balance) {

        balance += UnusedBackend.preBuiltOptions[1][1];
        return balance;
    }

    // method to subtract specific amount from account balance
    public static double subSpecific(double balance, double amount) {

        balance = (balance - amount);
        return balance;
    }

    // method to add 100 to account balance
    public static double addHundred(double balance) {

        balance += UnusedBackend.preBuiltOptions[0][0];
        return balance;
    }

    // method to add 1000 to account balance
    public static double addThousand(double balance) {

        balance += UnusedBackend.preBuiltOptions[0][1];
        return balance;
    }

    // method to add specific amount to account balance
    public static double addSpecific(double balance, double amount) {

        balance = (balance + amount);
        return balance;
    }

    public static PrintStream printList() {

        System.out.println("Balance History: ");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        return System.out;
    }

    public static void addList(double num) {
        list.add(Double.valueOf(num));

    }
    public static Double getList(int i) {
        return list.get(i);
    }

}
