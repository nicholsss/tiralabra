/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayList;
import java.util.List;
import ui.Ui;

/**
 *
 * @author Nicholas
 */
public class Main {

    /**
     *
     * @param args ohjelman käynnistyminen
     */
    public static void main(String[] args) {
        List<Cell> grid = new ArrayList<Cell>();
        int x = 3;
        int y = 3;
        Ui i = new Ui();
        System.out.println("Dfs");
        long alku = System.nanoTime();

        DfsRec dfs = new DfsRec(x, y);
        long loppu = System.nanoTime();
        System.out.println("Aikaa kului " + ((loppu - alku) / 1e9) + " s");

        System.out.println("Binary");
        long alku1 = System.nanoTime();

        BinaryTree binary = new BinaryTree(x, y);
        long loppu1 = System.nanoTime();
        System.out.println("Aikaa kului " + ((loppu1 - alku1) / 1e9) + " s");
    }
}
