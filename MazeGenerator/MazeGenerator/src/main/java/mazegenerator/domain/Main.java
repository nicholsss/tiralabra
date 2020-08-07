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
        int x = 3;
        int y = 3;
        /*
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                grid.add(new Cell(i, j));

            }
        }
         */
        System.out.println("main");
        //DFS dfs = new DFS(grid);
        DfsRec maze = new DfsRec(x, y);
        //dfs.GenerateMaze(10, 10);
    }
}
