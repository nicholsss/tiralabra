/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayList;
import java.util.List;

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
        int x = 6;
        int y = 6;

        System.out.println("main");
        long alku = System.nanoTime();

        DfsRec maze = new DfsRec(x, y);
        long loppu = System.nanoTime();
        System.out.println("Aikaa kului " + ((loppu - alku) / 1e9) + " s");
    }
}
