package tum.spaceinvaders.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;

public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_exit;

    @FXML
    void act_exit(ActionEvent event) {
        System.exit(0);
    }




    @FXML
    void initialize() {
        assert btn_exit != null : "fx:id=\"btn_exit\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }
}
