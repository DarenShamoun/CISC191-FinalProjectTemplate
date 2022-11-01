package edu.sdccd.cisc191.template;


public class User
{
    // a simple base class to add the information that we want in our main method
    private static String firstName;
    private static String lastName;
    private static String email;
    private static double[] wallet;

    private static int userID;

    public User(String firstName, String lastName, String email, double[] wallet)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.wallet = wallet;
    }

    //setter functions
    public void  setFirstName(String firstNameInput)
    {
         this.firstName = firstNameInput;
    }
    public void setLastName(String lastNameInput)
    {
        this.lastName = lastNameInput;
    }
    public void setEmail(String emailInput)
    {
        this.email = emailInput;
    }
    public void setWalletAmount(double[] newWalletAmount)
    {
        this.wallet = newWalletAmount;
    }


    //getter functions
    public static String getFirstName()
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
    public static double[] getWalletAmount()
    {
        return wallet;
    }
}