package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.stage.Stage;

//This is our starting point for the program currently
public class UserInterfaceJavaFX extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        //sets the initial scene to the login scene and gives it a title
        primaryStage.setScene(PreLoginSelectionScreen.preLogin(primaryStage));
        primaryStage.setTitle("The Totally NOT Fraudulent Bank");
        primaryStage.show();

    }
}