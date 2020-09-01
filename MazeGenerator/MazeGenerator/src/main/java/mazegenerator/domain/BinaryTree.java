/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.Random;
import util.ArrayList;

/**
 *
 * @author nicholas
 */
public class BinaryTree {

    private int rows;
    private int cols;
    private Cell[][] grid;

    /**
     * init grid
     *
     * @param rows amount of rows in grid
     * @param cols amount of cols in grid
     */
    public BinaryTree(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;

        grid = new Cell[this.rows][this.cols];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
        

    }

    /**
     * Start checking from cell [0][0] its neighbors
     */
    public void generateMaze() {

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                checkNeighbour(grid[i][j]);

            }
        }
    }

    /**
     * Check randomly TOP or LEFT neighbors of cell Fix needed: when if left
     * side is no go, it should go up.
     *
     * @param current cell which neighbors we check
     */
    private void checkNeighbour(Cell current) {
        Random r = new Random();
        //int RandomWay = r.nextInt(2);
        long randomWay = System.nanoTime() % 2;
        int row = current.getX();
        int col = current.getY();
        ArrayList<Cell> neighbours = new ArrayList<>();

        //Check top neighbour
        if (randomWay == 1) {

            if (row - 1 != -1) {

                current.setTop();
                grid[row - 1][col].setBottom();
                // this else if needs abit tweaking.
            } else if (col - 1 != -1) {
                current.setLeft();
                grid[row][col - 1].setRight();
            }
        }
        //Check left neighbour
        if (randomWay == 0) {
            if (col - 1 != -1) {

                current.setLeft();
                grid[row][col - 1].setRight();
                // this else if need a bit tweaking.
            } else if (row - 1 != -1) {
                current.setTop();
                grid[row - 1][col].setBottom();
            }
        }

    }

    public void draw() {
        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {
                if (grid[i][j].getTop() == true) {
                    System.out.print("+---");
                } else {
                    System.out.print("+   ");
                }

            }
            System.out.println("+");
            for (int j = 0; j < rows; j++) {
                if (grid[i][j].getLeft() == true) {
                    System.out.print("|   ");
                } else {
                    System.out.print("    ");
                }

            }
            System.out.println("|");

        }
        for (int j = 0; j < rows; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }
}
