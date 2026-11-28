package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.Utility.SceneSwitcher;
import javafx.event.ActionEvent;

public class StudentDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitRegistrationAndFormButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/submitRegistrationAndFormButtonOA.fxml",
                "Submit Registration and Form Page");
    }

    @javafx.fxml.FXML
    public void viewStatusOfMyTranscriptOrCertificateRequestButtobOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/viewStatusOfMyTranscriptOrCertificateRequestButtobOA.fxml",
                "View status of my transcript or certificate Page");
    }

    @javafx.fxml.FXML
    public void submitAQueryOrLodgeAComplaintToTheBoardButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/submitAQueryOrLodgeAComplaintToTheBoardButtonOA.fxml",
                "Submit query or lodge a complaint Page");
    }

    @javafx.fxml.FXML
    public void viewAdmitCardButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/viewAdmitCardButtonOA.fxml",
                "View admit card Page");
    }

    @javafx.fxml.FXML
    public void viewNoticeButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/viewNoticeButtonOA.fxml",
                "View notice Page");
    }

    @javafx.fxml.FXML
    public void viewMyMarksButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/viewMyMarksButtonOA.fxml",
                "View marks Page");
    }

    @javafx.fxml.FXML
    public void requestTranscriptOrCertificateButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/requestTranscriptOrCertificateButtonOA.fxml",
                "Request transcript or certificate Page");
    }

    @javafx.fxml.FXML
    public void signOutButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/login-view.fxml",
                "Home Page");
    }

    @javafx.fxml.FXML
    public void viewMyRegistrationButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/viewMyRegistrationButtonOA.fxml",
                "view registration Page");
    }
}