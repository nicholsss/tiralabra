/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import java.util.Stack;

/**
 *
 * @author Nicholas
 */
public class DFS {

    private Stack<Cell> stack = new Stack<Cell>();
    //private Cell[][] grid;
    //private Cell[] gri;
    //private List<Cell> grip;
    private int x;
    private int y;
    private List<Cell> grid;

    private ArrayList<String> directions = new ArrayList<String>();
    private Cell current;

    //Maze maze = new Maze(x, y);
    /**
     * Tässä alustamme gridin toistaiseksi.
     *
     * @param x leveys parametri
     * @param y korkeus parametri
     *
     */
    public DFS(List<Cell> grid) {

        this.x = x;
        this.y = y;
        this.grid = grid;

        current = grid.get(0);
        System.out.println(current.getVisited());
        GenerateMaze();
        System.out.println(current.getVisited());

    }

    /**
     * Täältä aletaan piirtämään sokkeloa
     */
    public void GenerateMaze() {

        DrawMaze();

    }

    /**
     * piirtää sokkelon. getVisited katsoo onko kyseisen Cell boolean true, ja
     * jos on niin printantaan O Tämä on vain visualisointia varten.
     *
     */
    public void DrawMaze() {

        current.setVisitedt(true);
        current.CheckNeighbors(grid);
        // current.CheckNeighbors(grid);
/*
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                if (grid[i][j].getVisited() == false) {
                    System.out.print("*");
                } else if (grid[i][j].getVisited() == true) {
                    System.out.print("O");
                }

            }
            System.out.println("");
        }
        System.out.println(grid.length);
        System.out.println(grid[0].length);
         */
    }

}
