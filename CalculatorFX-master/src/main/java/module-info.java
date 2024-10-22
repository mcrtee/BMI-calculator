module org.example.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculatorfx to javafx.fxml;
    exports org.example.calculatorfx;
}