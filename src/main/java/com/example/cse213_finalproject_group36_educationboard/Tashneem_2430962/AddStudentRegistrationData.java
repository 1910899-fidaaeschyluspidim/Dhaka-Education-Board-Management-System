package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.Utility.Alerts;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class AddStudentRegistrationData
{
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private ComboBox<String> examTypeComboB;
    @javafx.fxml.FXML
    private TableColumn<Registration, String> rollNoCol;
    @javafx.fxml.FXML
    private TextField registrationIDTF;
    @javafx.fxml.FXML
    private TextField studentIDTF;
    @javafx.fxml.FXML
    private TextField rollNoTF;
    @javafx.fxml.FXML
    private ComboBox<String> subjectComboB;
    @javafx.fxml.FXML
    private TableColumn<Registration, String> regIDCol;
    @javafx.fxml.FXML
    private TextArea statusTextArea;
    @javafx.fxml.FXML
    private TableColumn<Registration, String> examTypeCol;
    @javafx.fxml.FXML
    private TableColumn<Registration, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Registration, String> subjectCol;
    @javafx.fxml.FXML
    private TableView<Registration> tableViewID;
    @javafx.fxml.FXML
    private TableColumn<Registration, String> studIDCol;
    private ArrayList<Registration> registrationList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        subjectComboB.getItems().addAll("Maths", "English", "Bangla", "Science");
        examTypeComboB.getItems().addAll("SSC", "HSC");

        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        studIDCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        regIDCol.setCellValueFactory(new PropertyValueFactory<>("registrationId"));
        rollNoCol.setCellValueFactory(new PropertyValueFactory<>("rollNo"));
        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
        examTypeCol.setCellValueFactory(new PropertyValueFactory<>("exam"));

    }

    @javafx.fxml.FXML
    public void addToTableViewButtonOA(ActionEvent actionEvent) {

        if (studentIDTF.getText().length() != 7 || studentIDTF.getText().isEmpty()) {
            Alerts.errorAlert("please give valid 7-digit student ID");
            return;
        }
        if (nameTF.getText().isEmpty()) {
            Alerts.errorAlert("please give student name");
            return;
        }
        if (rollNoTF.getText().isEmpty()) {
            Alerts.errorAlert("please give your roll number");
            return;
        }
        if (registrationIDTF.getText().isEmpty()) {
            Alerts.errorAlert("please give registration number");
            return;
        }
        if (subjectComboB.getValue() == null) {
            Alerts.errorAlert("please select a subject");
            return;
        }
        if (examTypeComboB.getValue() == null) {
            Alerts.errorAlert("please select the exam type");
            return;
        }

        statusTextArea.setText("Submitted!");

        Registration reg = new Registration(
                registrationIDTF.getText(),
                studentIDTF.getText(),
                nameTF.getText(),
                rollNoTF.getText(),
                examTypeComboB.getValue(),
                subjectComboB.getValue(),
                statusTextArea.getText()
        );

        registrationList.add(reg);
        tableViewID.getItems().clear();
        tableViewID.getItems().addAll(registrationList);
    }
}