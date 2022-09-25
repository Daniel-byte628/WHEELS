module com.wheels {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.wheels to javafx.fxml;
    exports com.wheels.Controller;
    opens com.wheels.Controller to javafx.fxml;
    exports com.wheels.Modelo;
    opens com.wheels.Modelo to javafx.fxml;


}