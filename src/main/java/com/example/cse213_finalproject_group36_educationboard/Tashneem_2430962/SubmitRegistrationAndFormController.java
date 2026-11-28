package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.Utility.Alerts;
import com.example.cse213_finalproject_group36_educationboard.Utility.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SubmitRegistrationAndFormController
{
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

        if(studentIDTF.getText().isEmpty()){
            Alerts.errorAlert("please give valid 7-digit student ID");
            return;
        }
        if(nameTF.getText().isEmpty()){
            Alerts.errorAlert("please give student name");
            return;
        }
        if(rollNoTF.getText().isEmpty()){
            Alerts.errorAlert("please give your roll number");
            return;
        }
        if(registrationNoTF.getText().isEmpty()){
            Alerts.errorAlert("please give registration number");
            return;
        }
        if(subjectsComboB.getValue() == null){
            Alerts.errorAlert("please select a subject");
            return;
        }
        if(examTypeComboB.getValue() == null){
            Alerts.errorAlert("please select the exam type");
            return;
        }

        Registration r = new Registration(
                registrationNoTF.getText(),
                studentIDTF.getText(),
                nameTF.getText(),
                rollNoTF.getText(),
                examTypeComboB.getValue(),
                subjectsComboB.getValue(),
                statusTextArea.getText()
        );

        File f = new File("Registration.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            if (f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(r);
            oos.close();
            fos.close();

            statusTextArea.setText("Submitted!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}