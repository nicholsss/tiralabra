/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

//import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//import java.util.Stack;

/**
 *
 * @author Nicholas
 */
public class DfsRec {

    private Cell[][] grid;
    List<Cell> neighbours;
    int rows;
    int cols;
    int w = 40;

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
        //Stack<Cell> stack = new Stack<Cell>();
        Stack stack = new Stack(this.rows * this.cols);
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
                current.removeWalls(next);
                current = next;
                // if we didnt get cell with neighbours take cell from top of our stack.
            } else {
                next = stack.pop();
                current = grid[next.getX()][next.getY()];
            }
        }
        /*
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {

                if (grid[i][j].getTop() == true) {
                    System.out.print("T");

                }
                if (grid[i][j].getRight() == true) {
                    System.out.print("|");
                }
                if (grid[i][j].getBottom() == true) {
                    System.out.print("-");
                }
                if (grid[i][j].getLeft() == true) {
                    System.out.print("|");
                }

            }
            System.out.println("");
        }
         */
    }

    /**
     * Check if cell neighbors is in grid, and that it's not visited
     *
     * @param current current cell, which neighbors we need to check.
     * @return a random neighbor from our list if it has neighbors, if not
     * return null
     */
    private Cell checkValidNeighbours(Cell current) {
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
        if (x + 1 != cols && !grid[x + 1][y].getVisited()) {

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
    void display() {
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
