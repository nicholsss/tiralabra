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
 * @author sakyi
 */
public class HuntnKill {

    private Cell[][] grid;
    List<Cell> neighbours;
    int rows;
    int cols;

    public HuntnKill(int rows, int cols) {

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

    private void GenerateMaze() {
        Random ran = new Random();
       
        int rx = ran.nextInt(this.rows);
        int ry = ran.nextInt(this.cols);
        Cell current = grid[rx][ry];

        current.setVisited();
        Cell next = checkValidNeighbours(current);
        while (next != null) {
            current.removeWalls(next);
            current = next;
        }

    }

    private Cell checkValidNeighbours(Cell current) {
        neighbours = new ArrayList<Cell>();
        int x = current.getX();
        int y = current.getY();

        Cell cell = null;

        //Check current cell top neighbour
        if (y - 1 != -1 && !grid[x][y - 1].getVisited()) {

            neighbours.add(grid[x][y - 1]);
        }

        //Check current cell right neighbour
        if (x + 1 != rows && !grid[x + 1][y].getVisited()) {

            neighbours.add(grid[x + 1][y]);

        }
        //Check current cell bottom neighbour
        if (y + 1 != cols && !grid[x][y + 1].getVisited()) {

            neighbours.add(grid[x][y + 1]);
        }
        //Check current cell left neighbour
        if (x - 1 != -1 && !grid[x - 1][y].getVisited()) {

            neighbours.add(grid[x - 1][y]);
        }

        // if there is over 0 neighbour choose one of them randomly.
        if (neighbours.size() > 0) {
            cell = neighbours.get(new Random().nextInt(neighbours.size()));

        }

        return cell;

    }

}
