package edu.sdccd.cisc191.template;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreens
{
    public static Scene newUser(Stage mainStage)
    {
        GridPane newUserLoginPane = new GridPane();
        newUserLoginPane.setPadding(new Insets(20, 20, 60, 60));
        newUserLoginPane.setHgap(15);
        newUserLoginPane.setVgap(5);

        Scene newUserLoginScene = new Scene(newUserLoginPane, 580, 200);

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
            mainStage.setScene(PostLoginScreen.customerPostLogin(mainStage));
        });

        Button back = new Button("Back");
        GridPane.setHalignment(back, HPos.CENTER);
        back.setOnAction(e ->
        {
            mainStage.setScene(PreLoginSelectionScreen.preLogin(mainStage));
        });

        //sets the positions of the elements on the GridPane
        newUserLoginPane.add(labelHint, 1, 0);
        newUserLoginPane.add(labelFirstName, 0, 2);
        newUserLoginPane.add(textFieldFirstName, 1, 2);
        newUserLoginPane.add(labelLastName, 0, 3);
        newUserLoginPane.add(textFieldLastName, 1, 3);
        newUserLoginPane.add(labelEmail, 0, 4);
        newUserLoginPane.add(textFieldEmail, 1, 4);
        newUserLoginPane.add(buttonLogin, 1, 5);
        newUserLoginPane.add(back, 5, 5);

        //displays the initial login screen
        mainStage.setScene(newUserLoginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return newUserLoginScene;
    }

    public static Scene returningUser(Stage mainStage)
    {
        GridPane newUserLoginPane = new GridPane();
        newUserLoginPane.setPadding(new Insets(20, 20, 60, 60));
        newUserLoginPane.setHgap(15);
        newUserLoginPane.setVgap(5);

        Scene returningUserLoginScene = new Scene(newUserLoginPane, 580, 200);

        Label labelHint = new Label("Please enter your login information " +
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

//            MAKE THE CODE TO CHECK IF THEY ARE IN DATABASE
//
//
//
//
//
//
//

            //displays the post login screen
            mainStage.setScene(PostLoginScreen.customerPostLogin(mainStage));
        });

        Button back = new Button("Back");
        GridPane.setHalignment(back, HPos.CENTER);
        back.setOnAction(e ->
        {
            mainStage.setScene(PreLoginSelectionScreen.preLogin(mainStage));
        });

        //sets the positions of the elements on the GridPane
        newUserLoginPane.add(labelHint, 1, 0);
        newUserLoginPane.add(labelFirstName, 0, 2);
        newUserLoginPane.add(textFieldFirstName, 1, 2);
        newUserLoginPane.add(labelLastName, 0, 3);
        newUserLoginPane.add(textFieldLastName, 1, 3);
        newUserLoginPane.add(labelEmail, 0, 4);
        newUserLoginPane.add(textFieldEmail, 1, 4);
        newUserLoginPane.add(buttonLogin, 1, 5);
        newUserLoginPane.add(back, 5, 5);

        //displays the initial login screen
        mainStage.setScene(returningUserLoginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return returningUserLoginScene;
    }

    public static Scene employee(Stage mainStage)
    {
        GridPane employeeLoginPane = new GridPane();
        employeeLoginPane.setPadding(new Insets(20, 20, 60, 60));
        employeeLoginPane.setHgap(15);
        employeeLoginPane.setVgap(5);

        Scene employeeLoginScene = new Scene(employeeLoginPane, 580, 200);

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

//            CREATE CODE TO CHECK IF THEY ARE IN DATABASE
//
//
//
//
//
//
//
            //displays the post login screen
            mainStage.setScene(PostLoginScreen.customerPostLogin(mainStage));
        });

        Button back = new Button("Back");
        GridPane.setHalignment(back, HPos.CENTER);
        back.setOnAction(e ->
        {
            mainStage.setScene(PreLoginSelectionScreen.preLogin(mainStage));
        });

        //sets the positions of the elements on the GridPane
        employeeLoginPane.add(labelHint, 1, 0);
        employeeLoginPane.add(labelFirstName, 0, 2);
        employeeLoginPane.add(textFieldFirstName, 1, 2);
        employeeLoginPane.add(labelLastName, 0, 3);
        employeeLoginPane.add(textFieldLastName, 1, 3);
        employeeLoginPane.add(labelEmail, 0, 4);
        employeeLoginPane.add(textFieldEmail, 1, 4);
        employeeLoginPane.add(buttonLogin, 1, 5);
        employeeLoginPane.add(back, 5, 5);

        //displays the initial login screen
        mainStage.setScene(employeeLoginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return employeeLoginScene;
    }
}


