//package edu.sdccd.cisc191.template;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//// This is the main User class which contains the basic functionality
//// that all users of the banking app will have access to.
////class User
////{
////    // Each user has a unique user ID and a name.
////    int userId;
////    String name;
////
////    // This is the constructor for the User class.
////    public User(int userId, String name) {
////        this.userId = userId;
////        this.name = name;
////    }
////
////    // This method allows a user to log in to the banking app.
////    public void login() {
////        System.out.println("User " + userId + " logged in successfully.");
////    }
////
////    // This method allows a user to log out of the banking app.
////    public void logout() {
////        System.out.println("User " + userId + " logged out successfully.");
////    }
////}
//
//// This is the Customer subclass which extends the User class.
//// Customers have access to their own bank accounts and can perform
//// actions like withdrawing and depositing money.
//class Customer extends User
//{
//    // Each customer has a list of bank accounts associated with their user ID.
//    ArrayList<BankAccount> accounts;
//
//    // This is the constructor for the Customer class.
//    public Customer(int userId, String name)
//    {
//        super(userId, name);
//        accounts = new ArrayList<BankAccount>();
//    }
//
//    // This method allows a customer to withdraw money from a specified account.
//    public void withdraw(int accountId, double amount)
//    {
//        for (BankAccount account : accounts)
//        {
//            if (account.accountId == accountId)
//            {
//                account.withdraw(amount);
//            }
//        }
//    }
//
//    // This method allows a customer to deposit money into a specified account.
//    public void deposit(int accountId, double amount)
//    {
//        for (BankAccount account : accounts)
//        {
//            if (account.accountId == accountId)
//            {
//                account.deposit(amount);
//            }
//        }
//    }
//
//    // This method allows a customer to view the balance of a specified account.
//    public void viewBalance(int accountId)
//    {
//        for (BankAccount account : accounts)
//        {
//            if (account.accountId == accountId)
//            {
//                System.out.println("Current balance for account " + accountId + ": " + account.balance);
//            }
//        }
//    }
//}
//
//// This is the Employee subclass which extends the User class.
//// Employees have access to all users' accounts and can perform actions
//// like modifying account balances, adding new accounts, etc.
//class Employee extends User
//{
//    // This is the constructor for the Employee class.
//    ArrayList<User> users;
//
//    public Employee(int userId, String name)
//    {
//        super(userId, name);
//        users = new ArrayList<User>();
//    }
//
//    // This method allows an employee to add a new bank account for a specified user.
//    public void addAccount(int userId, BankAccount account)
//    {
//        for (User user : users)
//        {
//            if (user.userId == userId)
//            {
//                if (user instanceof Customer)
//                {
//                    Customer customer = (Customer) user;
//                    customer.accounts.add(account);
//                    System.out.println("Added new account with ID " + account.accountId + " for user " + userId + ".");
//                }
//            }
//        }
//    }
//
//    // This method allows an employee to modify the balance of a specified account.
//    public void modifyBalance(int accountId, double amount) {
//        for (User user : users) {
//            if (user instanceof Customer) {
//                Customer customer = (Customer) user;
//                for (BankAccount account : customer.accounts) {
//                    if (account.accountId == accountId) {
//                        account.balance += amount;
//                        System.out.println("Modified balance of account " + accountId + " for user " + user.userId + ".");
//                    }
//                }
//            }
//        }
//    }
//}
//
//// This is the BankAccount class which represents a bank account that belongs
//// to a customer. Each bank account has a unique account ID and a balance.
//class BankAccount
//{
//    int accountId;
//    double balance;
//
//    // This is the constructor for the BankAccount class.
//    public BankAccount(int accountId, double balance)
//    {
//        this.accountId = accountId;
//        this.balance = balance;
//    }
//
//    // This method allows a customer to withdraw money from their bank account.
//    public void withdraw(double amount)
//    {
//        if (balance >= amount)
//        {
//            balance -= amount;
//            System.out.println("Withdrew " + amount + " from account " + accountId + ".");
//        }
//        else
//        {
//            System.out.println("Insufficient funds in account " + accountId + ".");
//        }
//    }
//
//    // This method allows a customer to deposit money into their bank account.
//    public void deposit(double amount)
//    {
//        balance += amount;
//        System.out.println("Deposited " + amount + " into account " + accountId + ".");
//    }
//}
//
//// This is the main BankingApp class which contains the main method and
//// where the app's logic is implemented.
//class BankingApp
//{
//    // This is a list of all users of the banking app.
//    static ArrayList<User> users;
//
//    // This is the main method which runs when the app is launched.
//    public static void main(String[] args)
//    {
//        // Create a new list of users.
//        users = new ArrayList<User>();
//
//        // Create some test users and add them to the list.
//        Customer john = new Customer(1, "John Doe");
//        users.add(john);
//        Employee jane = new Employee(2, "Jane Smith");
//        users.add(jane);
//
//        // Have the users log in to the app.
//        john.login();
//        jane.login();
//
//        // Have the customer create a new bank account.
//        BankAccount account1 = new BankAccount(1, 1000);
//        john.accounts.add(account1);
//
//        // Have the customer withdraw money from their account.
//        john.withdraw(1, 500);
//
//        // Have the customer view their account balance.
//        john.viewBalance(1);
//
//        // Have the employee modify the balance of the customer's account.
//        jane.modifyBalance(1, 200);
//
//        // Have the customer view their account balance again.
//        john.viewBalance(1);
//
//        // Have the users log out of the app.
//        john.logout();
//        jane.logout();
//    }
//}
//
//
