/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;
import mazegenerator.domain.AldousBroder;
import mazegenerator.domain.BinaryTree;
import mazegenerator.domain.DfsRec;
import mazegenerator.domain.HuntnKill;

/**
 *
 * @author nicholas
 */
public class Ui {

    int x;
    int y;
    Scanner sc = new Scanner(System.in);

    public void start() {
        //int x = 25;
        //int y = 25;

        int reader = 99;
        System.out.println(" __  __                _____                           _             \n"
                + " |  \\/  |              / ____|                         | |            \n"
                + " | \\  / | __ _ _______| |  __  ___ _ __   ___ _ __ __ _| |_ ___  _ __ \n"
                + " | |\\/| |/ _` |_  / _ \\ | |_ |/ _ \\ '_ \\ / _ \\ '__/ _` | __/ _ \\| '__|\n"
                + " | |  | | (_| |/ /  __/ |__| |  __/ | | |  __/ | | (_| | || (_) | |   \n"
                + " |_|  |_|\\__,_/___\\___|\\_____|\\___|_| |_|\\___|_|  \\__,_|\\__\\___/|_|   \n"
                + "                                                                      \n"
                + "                                                                      ");
        System.out.print("Give row size: ");
        int readerX = sc.nextInt();
        System.out.print("Give column size: ");
        int readerY = sc.nextInt();
        int x = readerX;
        int y = readerY;
        while (reader != 0) {
            try {

                System.out.println("");
                System.out.println("Welcome to maze builder");

                System.out.println("1. Build Recursive Backtracker Maze");
                System.out.println("2. Build Binary Tree Maze");
                System.out.println("3. Build Hunt And Kill Maze");
                System.out.println("4. Build Aldous-Broder Maze");
                System.out.println("5. Build All");
                System.out.println("6. Average generation time from 10 runs");
                System.out.println("7. For new row and column size");
                System.out.println("0. To EXIT");
                System.out.print("Input value ");
                reader = sc.nextInt();
                System.out.println("");
                if (reader == 1) {
                    System.out.println("");

                    long alku = System.nanoTime();

                    DfsRec dfs = new DfsRec(x, y);
                    System.out.println("*************************");
                    System.out.println("* Recursive Backtracker *");
                    System.out.println("*************************");
                    dfs.generateMaze();
                    long loppu = System.nanoTime();
                    dfs.draw();
                    System.out.println("Time spent to build Recursive backtracker Maze " + ((loppu - alku) / 1e6) + " ms");

                }
                System.out.println("");
                if (reader == 2) {
                    System.out.println("");
                    System.out.println("********************");
                    System.out.println("* Binary Tree Maze *");
                    System.out.println("********************");
                    long alku1 = System.nanoTime();

                    BinaryTree binary = new BinaryTree(x, y);
                    binary.generateMaze();
                    long loppu1 = System.nanoTime();
                    binary.draw();
                    System.out.println("Time spent to build Binary Tree Maze " + ((loppu1 - alku1) / 1e6) + " ms");
                }
                System.out.println("");
                if (reader == 3) {
                    long alku = System.nanoTime();

                    HuntnKill hnk = new HuntnKill(x, y);
                    System.out.println("*************************");
                    System.out.println("*      Hunt And Kill    *");
                    System.out.println("*************************");
                    hnk.generateMaze();
                    long loppu = System.nanoTime();
                    hnk.draw();
                    System.out.println("Time spent to build Hunt And Kill Maze " + ((loppu - alku) / 1e6) + " ms");

                }
                System.out.println("");
                if (reader == 4) {
                    long alku = System.nanoTime();

                    AldousBroder ab = new AldousBroder(x, y);
                    System.out.println("*************************");
                    System.out.println("*     Aldrous-Broder    *");
                    System.out.println("*************************");
                    ab.generateMaze();

                    long loppu = System.nanoTime();

                    ab.draw();
                    System.out.println("Time spent to build Aldous-Broder Maze " + ((loppu - alku) / 1e6) + " ms");

                }

                System.out.println("");
                if (reader == 5) {
                    System.out.println("");

                    System.out.println("*************************");
                    System.out.println("* Recursive Backtracker *");
                    System.out.println("*************************");
                    long alku = System.nanoTime();
                    DfsRec dfs = new DfsRec(x, y);
                    dfs.generateMaze();
                    long loppu = System.nanoTime();
                    dfs.draw();

                    System.out.println("");
                    System.out.println("********************");
                    System.out.println("* Binary Tree Maze *");
                    System.out.println("********************");
                    long alku1 = System.nanoTime();
                    BinaryTree binary = new BinaryTree(x, y);
                    binary.generateMaze();
                    long loppu1 = System.nanoTime();
                    binary.draw();

                    System.out.println("");
                    System.out.println("*************************");
                    System.out.println("*      Hunt And Kill    *");
                    System.out.println("*************************");
                    long alku2 = System.nanoTime();
                    HuntnKill hnk = new HuntnKill(x, y);
                    hnk.generateMaze();
                    long loppu2 = System.nanoTime();
                    hnk.draw();

                    System.out.println("");
                    System.out.println("*************************");
                    System.out.println("*     Aldrous-Broder    *");
                    System.out.println("*************************");
                    long alku3 = System.nanoTime();
                    AldousBroder ab = new AldousBroder(x, y);
                    ab.generateMaze();
                    long loppu3 = System.nanoTime();
                    ab.draw();

                    System.out.println("");
                    System.out.println("Time spent to build Recursive backtracker Maze " + ((loppu - alku) / 1e6) + " ms");
                    System.out.println("Time spent to build Binary Tree Maze " + ((loppu1 - alku1) / 1e6) + " ms");
                    System.out.println("Time spent to build Hunt And Kill Maze " + ((loppu2 - alku2) / 1e6) + " ms");
                    System.out.println("Time spent to build Aldous-Broder Maze " + ((loppu3 - alku3) / 1e6) + " ms");
                }
                if (reader == 6) {
                    long dfsTotal = 0;
                    long btTotal = 0;
                    long hnkTotal = 0;
                    long abTotal = 0;

                    for (int i = 0; i < 10; i++) {
                        long alku = System.nanoTime();
                        DfsRec dfs = new DfsRec(x, y);
                        dfs.generateMaze();
                        long loppu = System.nanoTime();
                        dfsTotal += (loppu - alku);
                    }
                    for (int i = 0; i < 10; i++) {
                        long alku = System.nanoTime();
                        BinaryTree bt = new BinaryTree(x, y);
                        bt.generateMaze();
                        long loppu = System.nanoTime();
                        btTotal += (loppu - alku);
                    }
                    for (int i = 0; i < 10; i++) {
                        long alku = System.nanoTime();
                        HuntnKill hnk = new HuntnKill(x, y);
                        hnk.generateMaze();
                        long loppu = System.nanoTime();
                        hnkTotal += (loppu - alku);
                    }
                    for (int i = 0; i < 10; i++) {
                        long alku = System.nanoTime();
                        AldousBroder ab = new AldousBroder(x, y);
                        ab.generateMaze();
                        long loppu = System.nanoTime();
                        abTotal += (loppu - alku);
                    }

                    System.out.println("************************************");
                    System.out.println("*     Average time from 10 runs    *");
                    System.out.println("************************************");
                    System.out.println("dfs: " + (dfsTotal / 10) / 1e6 + " ms");
                    System.out.println("bt: " + (btTotal / 10) / 1e6 + " ms");
                    System.out.println("hnk: " + (hnkTotal / 10) / 1e6 + " ms");
                    System.out.println("ab: " + (abTotal / 10) / 1e6 + " ms");

                }
                if (reader == 7) {
                    System.out.print("Give row size: ");
                    int newX = sc.nextInt();
                    System.out.print("Give column size: ");
                    int newY = sc.nextInt();
                    x = newX;
                    y = newY;
                }

                if (reader == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("please input 1-4");
            }
        }

    }

}
