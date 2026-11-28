package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.Utility.Alerts;
import com.example.cse213_finalproject_group36_educationboard.Utility.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;

public class SubmitComplaintToTheBoard
{
    @javafx.fxml.FXML
    private TextField senderIDTF;
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboB;
    @javafx.fxml.FXML
    private TextField messageIDTF;
    @javafx.fxml.FXML
    private TextArea queryTextArea;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        categoryComboB.getItems().addAll("Query", "Message", "Complaint", "Request");
    }

    @javafx.fxml.FXML
    public void writeObjectToBinaryFileButtonOA(ActionEvent actionEvent) throws IOException {
        Message m = new Message(
                messageIDTF.getText(),
                senderIDTF.getText(),
                categoryComboB.getValue(),
                queryTextArea.getText(),
                statusLabel.getText()
        );

        File f;
        FileOutputStream fos;
        ObjectOutputStream oos;

        f = new File("Message.bin");

        if(f.exists()){
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(m);
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        if (messageIDTF.getText().isEmpty()) {
            Alerts.errorAlert("please give valid message ID");
            return;
        }
        if (senderIDTF.getText().isEmpty()) {
            Alerts.errorAlert("please give valid sender ID");
            return;
        }

        if (categoryComboB.getValue() == null) {
            Alerts.errorAlert("please select a category");
            return;
        }
        if(queryTextArea.getText().isEmpty()){
            Alerts.errorAlert("please write your query");
            return;
        }

        statusLabel.setText("Submitted");

    }
}