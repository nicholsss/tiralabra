/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.Random;

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
        GenerateMaze();

    }

    /**
     * Start checking from cell [0][0] its neighbours
     */
    private void GenerateMaze() {

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                CheckNeighbour(grid[i][j]);
            }
        }
    }

    /**
     * Check randomly TOP or LEFT neighbours of cell
     * Fix needed: when if left side is no go, it should go up.
     * @param current cell which neighbours we check
     */
    private void CheckNeighbour(Cell current) {
        Random r = new Random();
        int Randvalue = r.nextInt(2);
        // 0 is NORTH and 1 is WEST
        int row = current.getX();
        int col = current.getY();
        boolean check = false;
        // if Randvalue is 0 We check cell top
        if (Randvalue == 0) {
            if (row - 1 != -1) {
                current.setTop();
                check = true;
            }
            // if we cannot go top, we check if we can go left
            if (check == false) {
                Randvalue = 1;

            }
            // if Randvalue is 1 we check 
        }
        if (Randvalue == 1) {
            
            if (col - 1 != -1) {
                current.setLeft();
                
            }
            // if left is out of reach, open top wall.
            if (check == false) {
                current.setTop();
            }

        }
    }
}
