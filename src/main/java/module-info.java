module com.example.padroesdeprojetojava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.padroesdeprojetojava to javafx.fxml;
    exports com.example.padroesdeprojetojava;
}