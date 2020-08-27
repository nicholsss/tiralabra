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
        GenerateMaze();

    }

    private void GenerateMaze() {
        Random ran = new Random();

        int rx = ran.nextInt(this.rows);
        int ry = ran.nextInt(this.cols);
        Cell current = grid[rx][ry];

        current.setVisited();
        while (current != null) {

            Cell next = checkValidNeighbours(current);
            if (next != null) {
                next.setVisited();
                current.removeWalls(next);
                current = next;
            } else {
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
        if (y + 1 != rows && grid[x][y + 1].getVisited()) {

            visitedNeighbour.add(grid[x][y + 1]);

        }
        //Check current cell bottom neighbour
        if (x + 1 != cols && grid[x + 1][y].getVisited()) {

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
