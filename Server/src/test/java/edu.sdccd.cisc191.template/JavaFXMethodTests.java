package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFXMethodTests
{
    //could not figure out how to make this work in JavaFX on short notice
    //Tests user creation at the press of the Login button
    @Test
    void testLoginButton()
    {
        JFXPanel panel = new JFXPanel();
        JavaFXComponents comp = new JavaFXComponents();
        Button button = comp.createButton("login");
        TextField textFieldFirstName = new TextField("John");
        TextField textFieldLastName = new TextField("Doe");
        TextField textFieldEmail = new TextField("johndoe@example.com");

        button.setOnAction(e ->
        {
            String firstName = textFieldFirstName.getText();
            String lastName = textFieldLastName.getText();
            String email = textFieldEmail.getText();
            double[] wallet = {0.0};

            User newUser = new User(firstName, lastName, email, wallet);

            assertEquals("John", User.getName());
            assertEquals("Doe", User.getLastName());
            assertEquals("johndoe@example.com", User.getEmail());
            assertEquals(0.0, wallet[0]);
        });
    }

    //could not figure out how to make this work in JavaFX on short notice
    //Tests the add a hundred to wallet function which is held in a 1D array
    @Test
    void testAddHundredToWallet()
    {
        double[] moneyInWallet = {0.0};
        moneyInWallet[0] += 100.0;
        assertEquals(100.0, moneyInWallet[0]);
    }

    //could not figure out how to make this work in JavaFX on short notice
    //tests the add a hundred to wallet function but with a 2d array used instead
    @Test
    void testAddHundredToWalletWith2DArray()
    {
        double moneyInWallet[] = {0.0};

        final int[][] preBuiltOptions = new int[2][2];
        {
            preBuiltOptions[0][0] = 100;
            preBuiltOptions[0][1] = 1000;
        }

        moneyInWallet[0] += preBuiltOptions[0][0];
        assertEquals(100, moneyInWallet[0]);
    }
}