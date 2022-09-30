package edu.sdccd.cisc191.template;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WithdrawalScreen extends UserInterfaceJavaFX
{
    public static Scene display(Stage mainStage)
    {
        final double[] moneyInWallet = User.getWalletAmount();

        GridPane withdrawalPane = new GridPane();
        withdrawalPane.setPadding(new Insets(20, 20, 20, 20));
        withdrawalPane.setHgap(20);
        withdrawalPane.setVgap(20);

        Scene withdrawalScene = new Scene(withdrawalPane, 500, 300);

        Label labelWithdrawalHint = new Label("Please select how much you would like to withdraw: ");
        GridPane.setHalignment(labelWithdrawalHint, HPos.LEFT);

        Label currentWalletAmount = new Label(moneyInWallet[0]+"");
        GridPane.setHalignment(currentWalletAmount, HPos.RIGHT);

        //withdraw custom amounts
        Label labelCustomWithdrawal = new Label("Or enter a custom amount below: ");
        GridPane.setHalignment(labelCustomWithdrawal, HPos.LEFT);
        TextField customWithdrawalTextField = new TextField();
        GridPane.setMargin(customWithdrawalTextField, new Insets(0, 10, 10, 10));

        //the function that controls how the custom amount is handled when button is pressed
        Button withdrawalButton = new Button("withdraw");
        GridPane.setMargin(withdrawalButton, new Insets(10,10,10,10));
        withdrawalButton.setOnAction(e ->
        {
            moneyInWallet[0] -= Integer.parseInt(customWithdrawalTextField.getText());
            System.out.println(moneyInWallet[0]);
            currentWalletAmount.setText(moneyInWallet[0]+"");
        });

        //navigate back to previous page
        Button backButton = new Button("Back");
        GridPane.setMargin(backButton, new Insets(10, 10, 10, 10));
        backButton.setOnAction(e ->
        {
            mainStage.setScene(PostLoginScreen.display(mainStage));
        });

        //withdraw 100 dollars
        Button hundredWithdrawalButton = new Button(" - $100");
        GridPane.setMargin(hundredWithdrawalButton, new Insets(10, 10, 10, 10));
        hundredWithdrawalButton.setOnAction(e ->
        {
            moneyInWallet[0] -= 100.00;
            System.out.println(moneyInWallet[0]);
            currentWalletAmount.setText(moneyInWallet[0]+"");
        });

        //withdraw 1000 dollars
        Button thousandWithdrawalButton = new Button(" - $1000");
        GridPane.setMargin(thousandWithdrawalButton, new Insets(0, 10, 10, 10));
        thousandWithdrawalButton.setOnAction(e ->
        {
            moneyInWallet[0] -= 1000.00;
            System.out.println(moneyInWallet[0]);
            currentWalletAmount.setText(moneyInWallet[0]+"");
        });

        withdrawalPane.add(labelWithdrawalHint,0,0);
        withdrawalPane.add(hundredWithdrawalButton, 0, 1);
        withdrawalPane.add(thousandWithdrawalButton, 0, 2);
        withdrawalPane.add(labelCustomWithdrawal, 0, 3);
        withdrawalPane.add(currentWalletAmount,2,2);
        withdrawalPane.add(customWithdrawalTextField, 0, 4);
        withdrawalPane.add(withdrawalButton,1,4);
        withdrawalPane.add(backButton, 2, 4);

        return withdrawalScene;
    }
}