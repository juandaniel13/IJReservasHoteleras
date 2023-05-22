module com.example.ijreservashoteleras {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            //requires eu.hansolo.tilesfx;
            requires com.almasb.fxgl.all;
    
    opens com.example.ijreservashoteleras to javafx.fxml;
    exports com.example.ijreservashoteleras;
    exports com.example.ijreservashoteleras.controlador;
    opens com.example.ijreservashoteleras.controlador to javafx.fxml;
}