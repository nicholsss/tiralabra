/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
     * @param args Starting
     */
    public static void main(String[] args) {

        int x = 3;
        int y = 3;


        /*Scanner sc = new Scanner(System.in);
        System.out.println("What size Maze u want");
        int size = sc.nextInt();
         */
        long alku = System.nanoTime();

        DfsRec dfs = new DfsRec(x, y);
        System.out.println("*************************");
        System.out.println("* Recursive Backtracker *");
        System.out.println("*************************");
        dfs.draw();
        long loppu = System.nanoTime();
        System.out.println("Time spent to build Recursive backtracker Maze " + ((loppu - alku) / 1e9) + " s");

        System.out.println("");
        System.out.println("********************");
        System.out.println("* Binary Tree Maze *");
        System.out.println("********************");
        long alku1 = System.nanoTime();

        BinaryTree binary = new BinaryTree(x, y);
        binary.draw();
        long loppu1 = System.nanoTime();
        System.out.println("Time spent to build Binary Tree Maze " + ((loppu1 - alku1) / 1e9) + " s");
    }
}
