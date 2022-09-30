package edu.sdccd.cisc191.template;


public class User {
    // a simple class to add the information that we want in our main method
    private static String firstName;
    private static String lastName;
    private static String email;

    private static double[] wallet;

    public User(String firstName, String lastName, String email, double[] wallet)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.wallet = wallet;
    }

    public static String getName()
    {
        return firstName;
    }

    public static String getLastName()
    {
        return lastName;
    }

    public static String getEmail()
    {
        return email;
    }

    public static double[] getWalletAmount(){return wallet;}
}