module com.example.ejercicio4java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio4java to javafx.fxml;
    exports com.example.ejercicio4java;
    exports Ejercicio4Java;
    opens Ejercicio4Java to javafx.fxml;
}