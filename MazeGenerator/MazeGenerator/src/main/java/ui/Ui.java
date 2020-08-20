/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.TextField;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import mazegenerator.domain.MazeService;

/**
 *
 * @author Nicholas
 */
public class Ui extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane p = new BorderPane();
    }

    public void DrawMaze() {
        MazeService k = new MazeService();
        
        int x = 5;
        int y = 5;
        TextField usernameInput = new TextField();
        Integer.valueOf(usernameInput.getText());
        k.CreateMaze(5, 5);
        System.out.println(k);
        
        //TEE eka Bordrpane,
        // SCENE
        // Stage
        // 

    }

    public static void main(String[] args) {
        launch(args);
    }

}
