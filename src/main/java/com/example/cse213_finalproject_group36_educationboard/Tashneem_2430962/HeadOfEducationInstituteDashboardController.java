package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.Utility.SceneSwitcher;
import javafx.event.ActionEvent;

public class HeadOfEducationInstituteDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitCenterAllocationRequestsButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/submitCenterAllocationRequestsButtonOA.fxml",
                "Submit Center Allocation Requests Page");

    }

    @javafx.fxml.FXML
    public void postANoticeToStudentsButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/postANoticeToStudentsButtonOA.fxml",
                "Post z Notice to Students Page");
    }

    @javafx.fxml.FXML
    public void viewStudentAndTheirSubmissionStatusButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/viewStudentAndTheirSubmissionStatusButtonOA.fxml",
                "View Student And Their Submission Status Page");
    }

    @javafx.fxml.FXML
    public void enterMarksForAStudentButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/enterMarksForAStudentButtonOA.fxml",
                "Enter Marks For a Student Page");
    }

    @javafx.fxml.FXML
    public void recordStudentAttendanceButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/recordStudentAttendanceButtonOA.fxml",
                "Record Student Attendance Page");
    }

    @javafx.fxml.FXML
    public void addStudentRegistrationDataButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/addStudentRegistrationDataButtonOA.fxml",
                "Add Student Registration Data Page");
    }

    @javafx.fxml.FXML
    public void approveOrRejectTranscriptAndCertificateRequestsButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/approveOrRejectTranscriptAndCertificateRequestsButtonOA.fxml",
                "Approve or Reject Transcript and Certificate Requests Page");
    }

    @javafx.fxml.FXML
    public void signOutButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,
                "/com/example/cse213_finalproject_group36_educationboard/Tashneem_2430962/login-view.fxml",
                "Home Page");
    }
}