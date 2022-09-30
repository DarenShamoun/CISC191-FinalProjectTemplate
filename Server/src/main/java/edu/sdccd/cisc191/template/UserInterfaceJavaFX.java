package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserInterfaceJavaFX extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        //sets the initial scene to the login scene and gives it a title
        primaryStage.setScene(LoginScreen.display(primaryStage));
        primaryStage.setTitle("The Totally NOT Fraudulent Bank");
        primaryStage.show();
    }
}