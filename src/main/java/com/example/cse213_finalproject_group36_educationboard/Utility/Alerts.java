package com.example.cse213_finalproject_group36_educationboard.Utility;

import javafx.scene.control.Alert;

public class Alerts {
    public static void errorAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }
}
