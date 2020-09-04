/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import java.util.Random;
import util.ArrayList;
import util.Cell;
import util.Stack;

/**
 *
 * @author nicholas
 */
public class DfsRec {

    private Cell[][] grid;
    List<Cell> neighbours;
    int rows;
    int cols;

    /**
     *
     * @param rows amount of rows for grid
     * @param cols amount of cols for grid
     */
    public DfsRec(int rows, int cols) {
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
     * Here is our recursive method which checks our cell if it has neighbors.
     *
     */
    public Cell[][] generateMaze() {
        // we give stack size rows*cols so it's big enought. 
        Stack stack = new Stack(this.rows * this.cols);
        //First cell where we start.

        Cell current = grid[0][0];
        current.setVisited();
        stack.add(current);

        // keep going while there are cells in stack
        while (!stack.isEmpty()) {

            // check current cell neighbours
            Cell next = checkValidNeighbours(current);

            // if we got an cell, mark is visited and add it to stack.
            if (next != null) {
                next.setVisited();
                stack.add(next);
                current.removeWalls(next);
                current = next;
                // if we didnt get cell with neighbours take cell from top of our stack.
            } else {
                next = stack.pop();
                current = grid[next.getX()][next.getY()];
            }
        }
        return grid;

    }

    /**
     * Check if cell neighbors is in grid, and that it's not visited
     *
     * @param current current cell, which neighbors we need to check.
     * @return a random neighbor from our list if it has neighbors, if not
     * return null
     */
    public Cell checkValidNeighbours(Cell current) {
        //neighbours = new ArrayList<Cell>();

        ArrayList<Cell> neighbours = new ArrayList<>();
        int x = current.getX();
        int y = current.getY();

        Cell cell = null;
        //top
        if (x - 1 != -1 && !grid[x - 1][y].getVisited()) {

            neighbours.add(grid[x - 1][y]);
        }

        //Check current cell right neighbour
        if (y + 1 != cols && !grid[x][y + 1].getVisited()) {

            neighbours.add(grid[x][y + 1]);

        }
        //Check current cell bottom neighbour
        if (x + 1 != rows && !grid[x + 1][y].getVisited()) {

            neighbours.add(grid[x + 1][y]);
        }
        //Check current cell left neighbour
        if (y - 1 != -1 && !grid[x][y - 1].getVisited()) {

            neighbours.add(grid[x][y - 1]);
        }

        // if there is over 0 neighbour choose one of them randomly.
        if (neighbours.size() > 0) {
            cell = neighbours.get(new Random().nextInt(neighbours.size()));

        }

        return cell;

    }

    public Cell[][] getGrid() {

        return grid;
    }

    /**
     * Draw ASCII maze
     */
    public void draw() {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                if (grid[i][j].getTop() == true) {
                    System.out.print("+---");
                } else {
                    System.out.print("+   ");
                }

            }
            System.out.println("+");
            for (int j = 0; j < cols; j++) {
                if (grid[i][j].getLeft() == true) {
                    System.out.print("|   ");
                } else {
                    System.out.print("    ");
                }

            }
            System.out.println("|");

        }
        for (int j = 0; j < cols; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

}
