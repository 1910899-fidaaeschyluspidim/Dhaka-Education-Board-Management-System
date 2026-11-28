module com.example.cse213_finalproject_group36_educationboard {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;



    opens com.example.cse213_finalproject_group36_educationboard to javafx.fxml;
    opens com.example.cse213_finalproject_group36_educationboard.Tashneem_2430962 to javafx.fxml, javafx.base;
    exports com.example.cse213_finalproject_group36_educationboard;
}