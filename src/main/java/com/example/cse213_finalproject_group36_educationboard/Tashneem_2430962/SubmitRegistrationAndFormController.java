package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.Utility.Alerts;
import com.example.cse213_finalproject_group36_educationboard.Utility.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;

public class SubmitRegistrationAndFormController {
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField studentIDTF;
    @javafx.fxml.FXML
    private ComboBox<String> subjectsComboB;
    @javafx.fxml.FXML
    private TextField rollNoTF;
    @javafx.fxml.FXML
    private TextArea statusTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> examTypeComboB;
    @javafx.fxml.FXML
    private TextField registrationNoTF;

    @javafx.fxml.FXML
    public void initialize() {
        subjectsComboB.getItems().addAll("Maths", "English", "Bangla", "Science");
        examTypeComboB.getItems().addAll("SSC", "HSC");
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {

        if (studentIDTF.getText().length() != 7) {
            Alerts.errorAlert("please give valid 7-digit student ID");
            return;
        }
        if (nameTF.getText().isEmpty() || rollNoTF.getText().isEmpty() || registrationNoTF.getText().isEmpty() || subjectsComboB.getValue() == null || examTypeComboB.getValue() == null) {
            Alerts.errorAlert("please fill up all the fields");
            return;
        }
        statusTextArea.setText("Submitted!");
    }

    @javafx.fxml.FXML
    public void createRegistrationObjectButtonOA(ActionEvent actionEvent) throws IOException {
        Registration r = new Registration(
                registrationNoTF.getText(),
                studentIDTF.getText(),
                nameTF.getText(),
                rollNoTF.getText(),
                examTypeComboB.getValue(),
                subjectsComboB.getValue(),
                statusTextArea.getText()

        );

        File f;
        FileOutputStream fos;
        ObjectOutputStream oos;

        f = new File("Registration.bin");

        if(f.exists()){
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(r);
    }


}

