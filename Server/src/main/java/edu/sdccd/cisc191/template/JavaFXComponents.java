package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Button;

public class JavaFXComponents
{
        public Button createButton(String name)
        {
            JFXPanel panel = new JFXPanel();
            JavaFXComponents comp = new JavaFXComponents();
            Button button = comp.createButton("login");

            button.setOnAction(e ->
                    {
                    });

            return new Button(name);
        }

        //not enough time to correctly modularize the code (will get back to it later)

//        public Button customWithdrawalButton()
//        {
//            customWithdrawalButton().setOnAction(e ->
//            {
//                final double moneyInWallet[] = User.getWalletAmount();
//                moneyInWallet[0] -= Integer.parseInt(customWithdrawalTextField.getText());
//                System.out.println(moneyInWallet[0]);
//                currentWalletAmount.setText(moneyInWallet[0]+"");
//            });
//        }


//        User
//        User.moneyInWallet[0] += preBuiltOptions[0][0];
//            System.out.println(moneyInWallet[0]);
//            currentWalletAmount.setText(moneyInWallet[0]+"");
}
