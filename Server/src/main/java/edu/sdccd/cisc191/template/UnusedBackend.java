package edu.sdccd.cisc191.template;

import java.util.Random;
import java.util.Scanner;


public class UnusedBackend extends Bank {

    public static void main(String[] args)
    {
        //ArrayList<Double> list = new ArrayList<Double>();

         // getting the user's firstName, lastName, and email

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following information to login\n" +
                "Hint: Case sensitive");
        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your email address");
        String userEmail = scanner.nextLine();
        double[] wallet = {0.0};

        //creating a bank account with user information

        User user = new User(firstName,lastName,userEmail, wallet);

        // if methods return stored user information, begin the code

        if (firstName.equals(User.getName())&&lastName.equals(user.getLastName())&&userEmail.equals(user.getEmail()))
        {
            loginText();
            System.out.println("Hello "+ user.getName()+"!");


            // random balance generator for money in account
            int randomBalance;
            Random moneyInAccount = new Random();
            // limit set to 50,000 for random int for money in account

            randomBalance = moneyInAccount.nextInt(50000);

            double withdraw = 0;

            double deposit = 0;

            double[] userInfo = {randomBalance,deposit,withdraw };

            boolean logOut=false;

            System.out.println("currentBalance: " + userInfo[0]);
            Bank.addList(userInfo[0]);


            while (!logOut)
            {
                infoText();

                int userAction = scanner.nextInt();
                scanner.nextLine();

                switch (userAction)
                {
                    case 0:
                        System.out.println("Logging out...");

                        logOut = true;

                        break;

                        // first case where user is going to deposit

                    case 1:

                        System.out.println("How much would you like to add to your account?");
                        System.out.println("Press 1 for 100$\n" +
                                "press 2 for 1000$\n" +
                                "Press 3 for custom ");

                        int userChoiceNum1 = scanner.nextInt();
                        scanner.nextLine();

                       // if they want to deposit $100
                        if (userChoiceNum1 == 1)
                        {
                            userInfo[0] = Bank.addHundred(userInfo[0]);
                            System.out.println("currentBalance: " + userInfo[0]);
                            Bank.addList(userInfo[0]);


                            break;
                        }
                        // if they want to deposit $1000
                        else if (userChoiceNum1 == 2)
                        {
                            userInfo[0]= Bank.addThousand(userInfo[0]);
                            System.out.println("currentBalance: " + userInfo[0]);
                            Bank.addList(userInfo[0]);

                            break;
                        }
                        // if they want to deposit specific amount of money
                        else if (userChoiceNum1 == 3)
                        {
                            System.out.println("Please enter amount!");
                            double depositNum = scanner.nextDouble();
                            scanner.nextLine();

                            userInfo[0] = Bank.addSpecific(userInfo[0], depositNum);
                            System.out.println("currentBalance: " + userInfo[0]);
                            Bank.addList(userInfo[0]);

                            break;
                        }

                        // second case where user wants to withdraw money
                    case 2:

                        System.out.println("How much would you like to withdraw?");
                        System.out.println("Press 1 for 100$\n" +
                                "press 2 for 1000$\n" +
                                "Press 3 for custom ");

                        int userChoiceNum2 = scanner.nextInt();
                        scanner.nextLine();

                        // if they want to withdraw $100
                        if (userChoiceNum2==1)
                        {
                            userInfo[0] = Bank.subHundred(userInfo[0]);
                            System.out.println("currentBalance: " + userInfo[0]);
                            Bank.addList(userInfo[0]);

                            // if the money in the bank goes to negative value, print the warning text
                            if(userInfo[0]<0){
                                double moneyOwed = (userInfo[0] + ((userInfo[0])*-2));

                                warningText(moneyOwed, firstName);
                            }
                            break;
                        }

                        // if they want to withdraw $1000
                        else if (userChoiceNum2 == 2)
                        {
                            userInfo[0] = Bank.subThousand(userInfo[0]);
                            System.out.println("currentBalance: " + userInfo[0]);
                            Bank.addList(userInfo[0]);

                            // if the money in the bank goes to negative value, print the warning text
                            if(userInfo[0]<0){

                                double moneyOwed = (userInfo[0] + ((userInfo[0])*-2));

                                warningText(moneyOwed, firstName);
                            }
                            break;
                        }

                        // if they want to withdraw specific amount of money
                        else if (userChoiceNum2 == 3)
                        {
                            System.out.println("Please enter amount!");
                            double withdrawNum = scanner.nextDouble();
                            scanner.nextLine();

                            userInfo[0] = Bank.subSpecific(userInfo[0], withdrawNum);
                            System.out.println("currentBalance: " + userInfo[0]);
                            Bank.addList(userInfo[0]);

                            // if the money in the bank goes to negative value, print the warning text
                            if(userInfo[0]<0){
                                double moneyOwed = (userInfo[0] + ((userInfo[0])*-2));

                                warningText(moneyOwed, firstName);
                            }
                            break;
                        }

                        // third case where user wants to check balance history
                    case 3:

                        Bank.printList();


                }
            }
        }
        else
        {
            System.out.println("Login.java failed try again");
        }
    }
    private static void loginText()
    {
        System.out.println("Logging in...");
    }

    // text that is displayed after logging in
    private static void infoText()
    {
        System.out.println("\nPlease press\n" +
                "0 to logout\n" +
                "1 to add deposit\n" +
                "2 to withdraw\n" +
                "3 to check balance history\n");
    }

    /**
    @param amount holds the money owed from the bank which is negative value
     @param name user's name
     */
    private static String warningText(double amount, String name){

        System.out.println("\nDear " + name + ", \nYou are in the negative zone and owe the bank" +
                " $" + amount + " dollars. \nFailure to pay this amount will result in " +
                "a fee of 100 dollars per week and possibly JAIL TIME. \nPlease reach" +
                " out to your local bank to resolve this issue or online at ww.IOweTheBank.cm");

        // returning the previous System.out code
        return System.out.toString();
    }

    //final static 2D array that are used in bank class for calculations.
    public static final int[][] preBuiltOptions = new int[2][2];
    static {
        preBuiltOptions[0][0] = 100;
        preBuiltOptions[0][1] = 1000;
        preBuiltOptions[1][0] = -100;
        preBuiltOptions[1][1] = -1000 ;
    }
}
