/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;
import mazegenerator.domain.BinaryTree;
import mazegenerator.domain.DfsRec;

/**
 *
 * @author nicholas
 */
public class Ui {

    public void start() {
        int x = 10;
        int y = 10;
        
        int read = 99;
        while (read != 0) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Welcome to maze builder");
                System.out.println("1. build Recursive Backtracker Maze");
                System.out.println("2. Build Binary Tree Maze");
                System.out.println("3. Build both");
                System.out.println("0. To EXIT");
                System.out.print("Input value " );   
                read = sc.nextInt();
                System.out.println("");
                if (read == 1) {
                    System.out.println("");
                    long alku = System.nanoTime();

                    DfsRec dfs = new DfsRec(x, y);
                    System.out.println("*************************");
                    System.out.println("* Recursive Backtracker *");
                    System.out.println("*************************");
                    dfs.draw();
                    long loppu = System.nanoTime();
                    System.out.println("Time spent to build Recursive backtracker Maze " + ((loppu - alku) / 1e9) + " s");

                }
                System.out.println("");
                if (read == 2) {
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
                System.out.println("");
                if (read == 3) {
                    System.out.println("");
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
                if (read == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("please input 1-4");
            }
        }
        /*
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
         */

    }

}
