package com.example.ijreservashoteleras.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.w3c.dom.events.MouseEvent;

public class ingreso_controlador {

    @FXML
    private Button btn1;

    @FXML
    private Label text1;

    @FXML
    void hide(MouseEvent event) {
        text1.setVisible(false);
    }

}
