package tum.spaceinvaders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../../resources/MainMenu.fxml")));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        //functional requirement #1.3
        root.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ESCAPE) {
               System.exit(0);
            }
        });

    }

    public static void main(String[] args) { launch(args); }
}
