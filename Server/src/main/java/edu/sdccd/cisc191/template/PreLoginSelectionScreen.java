package edu.sdccd.cisc191.template;

import com.sun.deploy.util.SessionState;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class PreLoginSelectionScreen
{
    public static Scene preLogin(Stage mainStage)
    {
        //login window layout
        GridPane preLoginPane = new GridPane();
        preLoginPane.setPadding(new Insets(20, 20, 20, 20));
        preLoginPane.setHgap(10);
        preLoginPane.setVgap(10);

        Scene PreLoginScene = new Scene(preLoginPane);

        // Hint for the user
        Label makeSelectionText = new Label("Please select an option below:");
        GridPane.setHalignment(makeSelectionText, HPos.LEFT);

        //Login Button for existing users
        Button existingUsersButton = new Button("Existing Users");
        GridPane.setMargin(existingUsersButton, new Insets(0, 0, 0, 0));
        GridPane.setHalignment(existingUsersButton, HPos.LEFT);
        existingUsersButton.setOnAction(e ->
        {
            //displays the post login screen for existing users
            mainStage.setScene(LoginScreens.returningUser(mainStage));
        });

        //Login button for new users
        Button newUsersButton = new Button("New Users");
        GridPane.setMargin(newUsersButton, new Insets(0, 0, 0, 0));
        GridPane.setHalignment(newUsersButton, HPos.LEFT);
        newUsersButton.setOnAction(e ->
        {
            //displays the post login screen for new users
            mainStage.setScene(LoginScreens.employee(mainStage));
        });

        //Login Button for employee login
        Button employeeButton = new Button("Employees");
        GridPane.setMargin(employeeButton, new Insets(0, 0, 0, 0));
        GridPane.setHalignment(employeeButton, HPos.LEFT);
        employeeButton.setOnAction(e ->
        {
            //displays the  employee post login screen
            mainStage.setScene(LoginScreens.newUser(mainStage));
        });

        //Exit button
        Button exitButton = new Button("Exit");
        GridPane.setMargin(exitButton, new Insets(0, 0, 0, 0));
        GridPane.setHalignment(exitButton, HPos.LEFT);
        exitButton.setOnAction(e ->
        {
            //exits the program
            Platform.exit();
        });

        //sets the positions of the elements on the GridPane
        preLoginPane.add(makeSelectionText, 0, 0,3,1);
        preLoginPane.add(existingUsersButton, 0, 1);
        preLoginPane.add(newUsersButton, 1, 1);
        preLoginPane.add(employeeButton, 2, 1);
        preLoginPane.add(exitButton, 0, 2);

        //sets the sizes of the pre login screen
        ColumnConstraints column0 = new ColumnConstraints();
        column0.setPercentWidth(33);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(33);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(33);

        RowConstraints row0 = new RowConstraints();
        row0.setPercentHeight(33);
        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(33);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(33);
        preLoginPane.getRowConstraints().addAll(row0, row1, row2);

        //Testing
        //preLoginPane.setGridLinesVisible(true);

        //displays the initial login screen
        mainStage.setScene(PreLoginScene);
        mainStage.setTitle("The Totally NOT Fraudulent Bank");
        mainStage.show();

        return PreLoginScene;
    }
}
