package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.Button;

public class Controller {
    private Main main ;
    @FXML
    private PasswordField passwordText ;
    @FXML
    private TextField userNam;
    @FXML
    private Button resetButton ;
    @FXML
    private Button loginButton ;
    @FXML
    private Label label ;
    public void buttonOnClick(){
        System.out.println("Button Clicked!!");
    }
    public void loginAction(ActionEvent e) {
        String validUserName = "admin";
        String validPassword = "123";
        String userName = userNam.getText();
        String password = passwordText.getText();
        if (userName.equals(validUserName) && password.equals(validPassword)) {
            // successful login
            label.setText("Successfully logged in");

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR) ;
            alert.setTitle("Incorrect Credentials");
            alert.setHeaderText("Incorrect Credentials");
            alert.setContentText("The username and password you provided is not correct.");
            alert.showAndWait();
        }
    }
    public void resetAction(ActionEvent event) {
        userNam.setText(null);
        passwordText.setText(null);
        label.setText("Please log in");
    }
}