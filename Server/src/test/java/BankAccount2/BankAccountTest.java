package BankAccount2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {


    @Test
    void testUser()
    {
        double[] money = {0};
        User user = new User("John","Doe","johndoe@gmail.com", money);

        assertEquals("John", User.getName());
        assertEquals("Doe", User.getLastName());
        assertEquals("johndoe@gmail.com", User.getEmail());
        assertEquals(money, User.getWalletAmount());
    }

    @Test
    void testAddHundred()
    {
       double amount = 100;

       assertEquals(200, Bank.addHundred(amount));
    }

    @Test
    void testSubSpecific()
    {

        double amount = 100;
        double numSubtract =50;

        assertEquals(50,Bank.subSpecific(amount, numSubtract));

    }

    @Test
    void testPrintStream()
    {
        double number = 5000;
        Bank.addList(number);

        assertEquals(Bank.getList(0), number);
    }
}
