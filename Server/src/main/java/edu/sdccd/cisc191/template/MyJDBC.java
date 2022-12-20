package edu.sdccd.cisc191.template;

import java.sql.*;

public class MyJDBC
{
    public static void main(String[]args){
        try	{
            Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306", "test", "Pa$$word");

            //a statement is an interface that represents an SQL statement, we need a connection object to create a statement object, so we create a statement class and set it equal to the connection we made.
            Statement statement = connection.createStatement();

            // And the statement objects would return result set objects. A result set is a table of data representing the results that returned from the database
            ResultSet resultSet = statement.executeQuery("select * from Course");

            //Boolean, while it returns true = there’s more data to be shown
            while (resultSet.next()){
                System.out.print(resultSet.getString("courseID"));
                System.out.print(" ");
                System.out.print(resultSet.getString("subjectID"));
                System.out.print(" ");
                System.out.print(resultSet.getInt("courseNumber"));
                System.out.print(" ");
                System.out.print(resultSet.getString("title"));
                System.out.print(" ");
                System.out.print(resultSet.getInt("numOfCredits"));
                System.out.println(" ");
            }}catch(Exception e){
            e.printStackTrace();
        }
    }
}
