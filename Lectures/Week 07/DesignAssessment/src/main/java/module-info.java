module com.example.designassessment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.designassessment to javafx.fxml;
    exports com.example.designassessment;
}