package com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962;

import com.example.cse213_finalproject_group36_educationboard.Utility.Alerts;
import com.example.cse213_finalproject_group36_educationboard.Utility.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;

public class EnterMarksForAStudent
{
    @javafx.fxml.FXML
    private TableColumn<Marks, Float> marksCol;
    @javafx.fxml.FXML
    private TextField studentIDTF;
    @javafx.fxml.FXML
    private TableColumn<Marks, String> marksIDCol;
    @javafx.fxml.FXML
    private TableColumn<Marks, String> subjectCol;
    @javafx.fxml.FXML
    private TextField marksIDTF;
    @javafx.fxml.FXML
    private TableView<Marks> tableViewID;
    @javafx.fxml.FXML
    private TextField marksTF;
    @javafx.fxml.FXML
    private TableColumn<Marks, String> studentIDCol;
    private ArrayList<Marks> marksList = new ArrayList<>();
    @javafx.fxml.FXML
    private ComboBox<String> subjectComboB;

    @javafx.fxml.FXML
    public void initialize() {

        subjectComboB.getItems().addAll("Maths", "English", "Bangla", "Science");

        marksCol.setCellValueFactory(new PropertyValueFactory<>("marks"));
        marksIDCol.setCellValueFactory(new PropertyValueFactory<>("marksId"));
        studentIDCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        subjectCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
    }

    @javafx.fxml.FXML
    public void addToTableButtonOA(ActionEvent actionEvent) {
        float marks = Float.parseFloat(marksTF.getText());

        if (marks > 100 || marks < 0){
            Alerts.errorAlert("enter marks with in 0 to 100");
            return;
        }
        if (marksIDTF.getText().isEmpty() || studentIDTF.getText().isEmpty() || subjectComboB.getValue() == null){
            Alerts.errorAlert("please fill up all the fields");
            return;
        }
        if (studentIDTF.getText().length() != 7) {
            Alerts.errorAlert("please give valid 7-digit student ID");
            return;
        }

        Marks m = new Marks(

                marksIDTF.getText(),
                studentIDTF.getText(),
                subjectComboB.getValue(),
                marks
        );

        marksList.add(m);
        tableViewID.getItems().clear();
        tableViewID.getItems().addAll(marksList);
    }

    @javafx.fxml.FXML
    public void writeObjectToFileButtonOA(ActionEvent actionEvent) throws IOException {

        float marks = Float.parseFloat(marksTF.getText());

        Marks m = new Marks(

                marksIDTF.getText(),
                studentIDTF.getText(),
                subjectComboB.getValue(),
                marks
        );

        File f;
        FileOutputStream fos;
        ObjectOutputStream oos;

        f = new File("Marks.bin");

        if(f.exists()){
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(m);
    }
}