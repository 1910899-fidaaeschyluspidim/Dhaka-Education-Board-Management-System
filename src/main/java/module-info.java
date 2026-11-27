module com.example.cse213_finalproject_group36_educationboard {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.cse213_finalproject_group36_educationboard to javafx.fxml;
    exports com.example.cse213_finalproject_group36_educationboard;
}