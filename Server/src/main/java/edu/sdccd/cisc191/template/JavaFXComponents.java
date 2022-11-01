package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class JavaFXComponents
{
        public Button createButton(String name)
        {
            JavaFXComponents comp = new JavaFXComponents();
            Button buttonLogin = new Button(name);

            buttonLogin.setOnAction(e ->
                    {

                    });

            return new Button(name);
        }



}
