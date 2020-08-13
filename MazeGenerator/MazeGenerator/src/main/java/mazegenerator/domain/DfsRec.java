/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Nicholas
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
        GenerateMaze();

    }

    /**
     * Here is our recursive method which checks our cell if it has neighbors.
     *
     */
    public void GenerateMaze() {
        Stack<Cell> stack = new Stack<Cell>();
        //First cell where we start.
        Cell current = grid[0][0];
        current.setVisitedt();
        stack.add(current);
        
        // keep going while there are cells in stack
        while (!stack.isEmpty()) {

            // check current cell neighbours
            Cell next = checkValidNeighbours(current);

            // if we got an cell, mark is visited and add it to stack.
            if (next != null) {
                next.setVisitedt();
                stack.add(next);
                //current.removeWalls(current);
                current = next;

                // if we didnt get cell with neighbours take cell from top of our stack.
            } else {
                next = stack.pop();
                current = grid[next.getX()][next.getY()];
            }
        }

    }

    /**
     * Check if cell neighbors is in grid, and that it's not visited
     *
     * @param current current cell, which neighbors we need to check.
     * @return a random neighbor from our list if it has neighbors, if not
     * return null
     */
    private Cell checkValidNeighbours(Cell current) {
        neighbours = new ArrayList<Cell>();
        int x = current.getX();
        int y = current.getY();
        Cell cell = null;

        //Check current cell top neighbour
        if (y - 1 != -1 && !grid[x][y - 1].getVisited()) {
            System.out.println("TOP");
            neighbours.add(grid[x][y - 1]);
        }

        //Check current cell right neighbour
        // this need to be fixed
        if (x + 1 != rows && !grid[x + 1][y].getVisited()) {
            System.out.println("RIGHT");
            neighbours.add(grid[x + 1][y]);

        }
        //Check current cell bottom neighbour
        if (y + 1 != cols && !grid[x][y + 1].getVisited()) {
            System.out.println("BOT");
            neighbours.add(grid[x][y + 1]);
        }
        //Check current cell left neighbour
        if (x - 1 != -1 && !grid[x - 1][y].getVisited()) {
            System.out.println("LEFT");
            neighbours.add(grid[x - 1][y]);
        }

        // if there is over 0 neighbour choose one of them randomly.
        if (neighbours.size() > 0) {
            cell = neighbours.get(new Random().nextInt(neighbours.size()));
            System.out.println(cell.getX());
        }

        return cell;

    }
}
