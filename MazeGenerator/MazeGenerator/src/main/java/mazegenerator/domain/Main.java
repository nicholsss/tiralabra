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
import ui.Ui;

/**
 *
 * @author Nicholas
 */
public class Main {

    /**
     *
     * @param args Starting
     */
    public static void main(String[] args) {

        //BinaryTree bt = new BinaryTree(15, 20);
        //bt.generateMaze();
        // bt.draw();
        /*
        DfsRec dfs = new DfsRec(3, 2);
        System.out.println("hasjooooos");
        dfs.generateMaze();
        System.out.println("hajos");
        dfs.draw();

         */
        Ui ui = new Ui();
        ui.start();

    }
}
