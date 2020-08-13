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
    int cols;
    int width;
    int w;

    //Maze maze = new Maze(x, y);
    /**
     * Init grid.
     *
     * @param x leveys parametri
     * @param y korkeus parametri
     *
     */
    public DFS(List<Cell> grid) {

        this.x = x;
        this.y = y;
        this.grid = grid;
        w = 40;
        current = grid.get(0);
        System.out.println(current.getVisited());

        System.out.println(current.getVisited());
        cols = width / w;

    }
}
