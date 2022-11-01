package edu.sdccd.cisc191.template;

import java.io.*;

public class UserDataHandling
{
    public static class CreateFile
    {
        public void main(String[] args)
        {
            try
            {
                File myObj = new File("userdata.txt");
                if (myObj.createNewFile())
                {
                    System.out.println("User data file created: " + myObj.getName());
                }
                else
                {
                    System.out.println("User data file already exists.");
                }
            }
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public static void writeObjectToFile(Customer cust, File file) throws IOException
    {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(cust);
            oos.flush();
        }
    }

    public static Customer readObjectFromFile(File file) throws IOException, ClassNotFoundException
    {
        Customer result;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            result = (Customer) ois.readObject();
        }
        return result;
    }
}
