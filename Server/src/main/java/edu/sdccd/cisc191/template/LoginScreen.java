package edu.sdccd.cisc191.template;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreen
{
    public static Scene display(Stage mainStage)
    {
        //login window layout
        GridPane loginPane = new GridPane();
        loginPane.setPadding(new Insets(20, 20, 60, 60));
        loginPane.setHgap(15);
        loginPane.setVgap(5);

        Scene loginScene = new Scene(loginPane, 580, 200);

        // Hint for the user
        Label labelHint = new Label("Please enter the following information " +
                "  (Hint: Case sensitive)");
        GridPane.setHalignment(labelHint, HPos.LEFT);

        //Firstname text field and label
        Label labelFirstName = new Label("Firstname:");
        GridPane.setHalignment(labelFirstName, HPos.LEFT);
        TextField textFieldFirstName = new TextField();

        //LastName text field and label
        Label labelLastName = new Label("Lastname");
        GridPane.setHalignment(labelLastName, HPos.LEFT);
        TextField textFieldLastName = new TextField();

        //Email text field and label
        Label labelEmail = new Label("Email:");
        GridPane.setHalignment(labelEmail, HPos.LEFT);
        TextField textFieldEmail = new TextField();

        //Login Button and its supporting code
        Button buttonLogin = new Button("Login");
        GridPane.setMargin(buttonLogin, new Insets(10, 0, 0, 0));
        buttonLogin.setOnAction(e ->
        {
            //takes the values from each textField and stores them
            String firstName = textFieldFirstName.getText();
            String lastName = textFieldLastName.getText();
            String email = textFieldEmail.getText();
            double[] wallet = {0.0};

            //creates the user based on the information provided in the login fields
            //the user has a default balance of 0
            User newUser = new User(firstName, lastName, email, wallet);

            //testing
            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(email);
            System.out.println(wallet[0]);

            //displays the post login screen
            mainStage.setScene(PostLoginScreen.display(mainStage));
        });

        //sets the positions of the elements on the GridPane
        loginPane.add(labelHint, 1, 0);
        loginPane.add(labelFirstName, 0, 2);
        loginPane.add(textFieldFirstName, 1, 2);
        loginPane.add(labelLastName, 0, 3);
        loginPane.add(textFieldLastName, 1, 3);
        loginPane.add(labelEmail, 0, 4);
        loginPane.add(textFieldEmail, 1, 4);
        loginPane.add(buttonLogin, 1, 5);

        //displays the initial login screen
        mainStage.setScene(loginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return loginScene;
    }
}
