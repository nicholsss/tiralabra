/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.AldousBroder;
import domain.BinaryTree;
import domain.DfsRec;
import domain.HuntnKill;

public class Performance {

    int start = 0;
    int end = 10;
    int rows;
    int cols;

    public Performance(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public void testDFS() {
        DfsRec dfs = new DfsRec(rows, cols);
        System.out.println("");
        for (int i = 0; i < end; i++) {
            long alku = System.nanoTime();

            dfs.generateMaze();
            long loppu = System.nanoTime();
        }
        long alku = System.nanoTime();

        dfs.generateMaze();
        long loppu = System.nanoTime();

        System.out.println("average time spent to build 100x100 maze with 10 runs" + ((loppu - alku) / 1e6) + " ms");

    }

    public void testBinary() {
        BinaryTree bt = new BinaryTree(rows, cols);
        System.out.println("");

        long alku = System.nanoTime();

        bt.generateMaze();
        long loppu = System.nanoTime();

        System.out.println("average time spent to build 100x100 maze with 10 runs" + ((loppu - alku) / 1e6) + " ms");

    }

    public void testAldousBroder() {
        AldousBroder ab = new AldousBroder(rows, cols);
        System.out.println("");

        long alku = System.nanoTime();

        ab.generateMaze();
        long loppu = System.nanoTime();

        System.out.println("average time spent to build 100x100 maze with 10 runs" + ((loppu - alku) / 1e6) + " ms");

    }

    public void testHuntnKill() {
        HuntnKill hnk = new HuntnKill(rows, cols);
        System.out.println("");

        long alku = System.nanoTime();

        hnk.generateMaze();
        long loppu = System.nanoTime();

        System.out.println("average time spent to build 100x100 maze with 10 runs" + ((loppu - alku) / 1e6) + " ms");

    }

}
