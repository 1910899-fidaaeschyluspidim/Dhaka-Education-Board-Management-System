package com.example.cse213_finalproject_group36_educationboard;

import com.example.cse213_finalproject_group36_educationboard.Utility.Alerts;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class LoginViewController {
    @javafx.fxml.FXML
    private TextField userIDTF;
    @javafx.fxml.FXML
    private TextField userNameTF;
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private TextField userEmailTF;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboB;

    @javafx.fxml.FXML
    public void initialize (){
        userTypeComboB.getItems().addAll("Student", "Head of Education institute");
    }

    private boolean isValid(){
        boolean valid = true;
        Alerts.errorAlert("Please fill up all the required fields!");
        if (userIDTF.getText().isEmpty() || userNameTF.getText().isEmpty() || passwordTF.getText().isEmpty() || userEmailTF.getText().isEmpty() || userTypeComboB.getValue() == null){
            valid = false;

        }
        return valid;
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) {
        String userName = userNameTF.getText();
        String email = userEmailTF.getText();
        String userId = userIDTF.getText();
        String password = passwordTF.getText();
        String userType = userTypeComboB.getValue();




    }
}
