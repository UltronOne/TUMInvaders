package tum.spaceinvaders.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_exit;

    @FXML
    private Button btn_play;

    @FXML
    void act_exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void act_play(ActionEvent event) {

        System.out.println("sgöldh");
        Label secondLabel = new Label("Game Window");

        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().add(secondLabel);

        Scene secondScene = new Scene(secondaryLayout, 450, 450);

        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("Second Stage");
        newWindow.setScene(secondScene);
        newWindow.show();


    }


    @FXML
    void initialize() {
        assert btn_exit != null : "fx:id=\"btn_exit\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }
}
