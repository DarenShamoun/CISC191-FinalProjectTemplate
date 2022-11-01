package edu.sdccd.cisc191.template;

import java.io.Serializable;

public class Employee extends User implements Serializable
{
    private static final long serialVersionUID = 1L;
    public Employee(String firstName, String lastName, String email, double[] wallet)
    {
        super(firstName, lastName, email, wallet);
        int idNumber;
        boolean administrativeRights = true;
    }


}
