/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ui.Ui;

/**
 *
 * @author Nicholas
 */
public class Main {

   /* @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        GridPane mazeGrid = new GridPane();
        Scene maze = new Scene(mazeGrid, 400, 400);
        
        window.setScene(maze);
        window.show();
        generate();
    }
    public void generate(){
        int x = 3;
        int y = 3;
        DfsRec dfs = new DfsRec(x, y);
        dfs.display();
    }
    */

    /**
     *
     * @param args ohjelman käynnistyminen
     */

    public static void main(String[] args) {
   
        
        
        
        int x = 10;
        int y = 10;
        Ui i = new Ui();
        System.out.println("Dfs");
        long alku = System.nanoTime();

        DfsRec dfs = new DfsRec(x, y);
        dfs.display();
        long loppu = System.nanoTime();
        System.out.println("Aikaa kului " + ((loppu - alku) / 1e9) + " s");

        System.out.println("Binary");
        long alku1 = System.nanoTime();

        BinaryTree binary = new BinaryTree(x, y);
        long loppu1 = System.nanoTime();
        System.out.println("Aikaa kului " + ((loppu1 - alku1) / 1e9) + " s");
    }
}
