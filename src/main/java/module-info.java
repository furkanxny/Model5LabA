module com.mycompany.fxmlexamples {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.fxmlexamples to javafx.fxml;
    exports com.mycompany.fxmlexamples;
}
