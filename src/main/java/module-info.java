module com.example.appfaztudo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.appfaztudo to javafx.fxml;
    exports com.example.appfaztudo;
}