module com.example.javafx_tp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafx_tp to javafx.fxml;
    opens com.example.javafx_tp.Controller to javafx.fxml;
    opens com.example.javafx_tp.entities to javafx.base;
    exports com.example.javafx_tp;
}