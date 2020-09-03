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
    List<Cell> visitedNeighbour;
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

    }

    public void generateMaze() {
        Random ran = new Random();
        long rx = System.nanoTime() % this.rows;
        long ry = System.nanoTime() % this.cols;
        Cell current = grid[(int) rx][(int) ry];

        current.setVisited();
        while (current != null) {

            Cell next = checkValidNeighbours(current);

            // if cell is not null, visit it, and remove walls between current
            // and next cell
            if (next != null) {
                next.setVisited();
                current.removeWalls(next);
                current = next;

            } else {

                // if cell doesnt have neighbour, start looking unvisited cell from
                // top row to bottom row until found unvisited cell.
                // When cell found visit it, and remove walls between found cell
                // and already visited cell
                loop:
                for (int i = 0; i < this.rows; i++) {
                    for (int j = 0; j < this.cols; j++) {
                        current = null;
                        if (grid[i][j].getVisited() == false) {
                            current = grid[i][j];
                            current.setVisited();

                            Cell prev = checkNeighbour(current);
                            if (prev != null) {
                                prev.removeWalls(current);
                            }

                            //This breaks algorithm if x, y too big.
                            break loop;
                        }

                    }
                }
            }
        }

    }

    private Cell checkValidNeighbours(Cell current) {
        neighbours = new ArrayList<>();
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

    /**
     * Check current cell all visited neighbors so walls can be removed from
     * visited cell and current cell.
     *
     * @param current unvisited cell from grid
     * @return cell which is next to current cell
     */
    private Cell checkNeighbour(Cell current) {
        visitedNeighbour = new ArrayList<Cell>();

        int x = current.getX();
        int y = current.getY();

        Cell cell = null;

        if (x - 1 != -1 && grid[x - 1][y].getVisited()) {

            visitedNeighbour.add(grid[x - 1][y]);
        }

        //Check current cell right neighbour
        if (y + 1 != cols && grid[x][y + 1].getVisited()) {

            visitedNeighbour.add(grid[x][y + 1]);

        }
        //Check current cell bottom neighbour
        if (x + 1 != rows && grid[x + 1][y].getVisited()) {

            visitedNeighbour.add(grid[x + 1][y]);
        }
        //Check current cell left neighbour
        if (y - 1 != -1 && grid[x][y - 1].getVisited()) {

            visitedNeighbour.add(grid[x][y - 1]);
        }

        // if there is over 0 neighbour choose one of them randomly.
        if (visitedNeighbour.size() > 0) {
            cell = visitedNeighbour.get(new Random().nextInt(visitedNeighbour.size()));

        }

        return cell;

    }

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
