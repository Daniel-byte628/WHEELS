module com.wheels {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens Modelo to javafx.fxml;
    exports Modelo;
    exports controller;
    opens controller to javafx.fxml;


}