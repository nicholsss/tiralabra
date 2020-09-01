/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nicholas
 */
public class AldousBroder {

    private Cell[][] grid;
    List<Cell> neighbours;
    int rows;
    int cols;

    /**
     *
     * @param rows amount of rows for grid
     * @param cols amount of cols for grid
     */
    public AldousBroder(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        grid = new Cell[this.rows][this.cols];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }

    }

    public void generateMaze() {
        long rx = System.nanoTime() % this.rows;
        long ry = System.nanoTime() % this.cols;
        int done = this.cols * this.rows;
        int counter = 1;
        Cell current = grid[(int) rx][(int) ry];
        current.setVisited();
        while (counter != done) {
            Cell next = checkNeighbour(current);

            if (next.getVisited() == false) {
                next.setVisited();
                current.removeWalls(next);
                counter++;
            }
            current = next;

        }

    }

    public Cell checkNeighbour(Cell current) {
        neighbours = new ArrayList<Cell>();

        int x = current.getX();
        int y = current.getY();

        Cell cell = null;

        if (x - 1 != -1) {

            neighbours.add(grid[x - 1][y]);
        }

        //Check current cell right neighbour
        if (y + 1 != rows) {

            neighbours.add(grid[x][y + 1]);

        }
        //Check current cell bottom neighbour
        if (x + 1 != cols) {

            neighbours.add(grid[x + 1][y]);
        }
        //Check current cell left neighbour
        if (y - 1 != -1) {

            neighbours.add(grid[x][y - 1]);
        }

        // if there is over 0 neighbour choose one of them randomly.
        if (neighbours.size() > 0) {
            cell = neighbours.get(new Random().nextInt(neighbours.size()));

        }

        return cell;
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
