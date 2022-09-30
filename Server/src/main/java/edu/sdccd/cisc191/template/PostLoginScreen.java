package edu.sdccd.cisc191.template;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PostLoginScreen extends UserInterfaceJavaFX
{
    public static Scene display(Stage mainStage)
    {
        //Sets the design and size of the post-login scene
        GridPane postLoginPane = new GridPane();
        postLoginPane.setPadding(new Insets(20, 20, 20, 20));
        postLoginPane.setHgap(20);
        postLoginPane.setVgap(20);

        Scene postLoginScene = new Scene(postLoginPane, 200, 260);

        //stores the local variable for the users money
        final double[] moneyInWallet = User.getWalletAmount();

        //creates a label to show the "Current balance" text
        Label currentBalanceText = new Label("Current Balance:");
        GridPane.setHalignment(currentBalanceText, HPos.CENTER);

        //creates a label that displays the users current money in account
        Label currentWalletAmount = new Label( moneyInWallet[0]+"");
        GridPane.setHalignment(currentWalletAmount, HPos.CENTER);

        //takes the user to the deposit screen
        Button depositButton = new Button("Deposit");
        GridPane.setHalignment(depositButton, HPos.CENTER);
        depositButton.setOnAction(e ->
        {
            mainStage.setScene(DepositScreen.display(mainStage));
        });

        //takes the user to the withdrawal scene
        Button withdrawButton = new Button("Withdraw");
        GridPane.setHalignment(withdrawButton, HPos.CENTER);
        withdrawButton.setOnAction(e ->
        {
            mainStage.setScene(WithdrawalScreen.display(mainStage));
        });

        //logs the user out and takes them to the login screen
        Button buttonLogout = new Button("Logout");
        GridPane.setHalignment(buttonLogout, HPos.CENTER);
        buttonLogout.setOnAction(e ->
        {
            mainStage.setScene(LoginScreen.display(mainStage));
        });

        //sets the positions of the elements on the GridPane
        postLoginPane.add(currentBalanceText,2,0);
        postLoginPane.add(currentWalletAmount,2,1);
        postLoginPane.add(depositButton, 2,2);
        postLoginPane.add(withdrawButton,2,3);
        postLoginPane.add(buttonLogout, 2,4);


        mainStage.setScene(postLoginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return postLoginScene;
    }

}
