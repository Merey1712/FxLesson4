module com.example.lessson3_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lessson3_fx to javafx.fxml;
    exports com.example.lessson3_fx;
}